package com.sh.studyspringboot.payment.service;

import com.sh.studyspringboot.payment.event.UserPaymentEvent;
import com.sh.studyspringboot.payment.model.PaymentRequest;
import com.sh.studyspringboot.payment.strategy.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.core.ApplicationPushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final Map<String, PaymentStrategy> paymentStrategyMap;
    private final ApplicationEventPublisher publisher;

    @Autowired
    public PaymentServiceImpl(Map<String, PaymentStrategy> paymentStrategyMap, ApplicationEventPublisher publisher) {
        this.paymentStrategyMap = paymentStrategyMap;
        this.publisher = publisher;
    }

    @Override
    public void process(PaymentRequest paymentRequest) throws Exception {
        PaymentStrategy ps = paymentStrategyMap.get(paymentRequest.getType());
        if (ps == null) throw new Exception("Error");
        ps.pay(paymentRequest);
    }

    @Override
    public void notify(PaymentRequest paymentRequest) throws Exception {
        System.out.println("Notify.....");
        publisher.publishEvent(new UserPaymentEvent(this, paymentRequest));
    }
}
