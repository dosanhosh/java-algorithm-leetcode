package com.sh.studyspringboot.payment.service;

import com.sh.studyspringboot.payment.model.PaymentRequest;
import com.sh.studyspringboot.payment.strategy.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final Map<String, PaymentStrategy> paymentStrategyMap;

    @Autowired
    public PaymentServiceImpl(Map<String, PaymentStrategy> paymentStrategyMap) {
        this.paymentStrategyMap = paymentStrategyMap;
    }

    @Override
    public void process(PaymentRequest paymentRequest) throws Exception {
        PaymentStrategy ps = paymentStrategyMap.get(paymentRequest.getType());
        if (ps == null) throw new Exception("Error");
        ps.pay(paymentRequest);
    }
}
