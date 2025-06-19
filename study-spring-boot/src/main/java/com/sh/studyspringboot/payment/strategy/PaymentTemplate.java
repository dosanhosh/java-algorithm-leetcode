package com.sh.studyspringboot.payment.strategy;

import com.sh.studyspringboot.payment.event.UserPaymentEvent;
import com.sh.studyspringboot.payment.model.PaymentRequest;
import com.sh.studyspringboot.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public abstract class PaymentTemplate {

    @Autowired
    private ApplicationEventPublisher publisher;



    public final void executePayment(PaymentRequest rq) throws Exception {
        validate(rq);
        processPayment(rq);
        sendReceipt(rq);
    }

    protected void validate(PaymentRequest rq) {
        System.out.println("✅ Validate đơn hàng: " + rq.getPaymentId());
    }

    protected abstract void processPayment(PaymentRequest rq);

    protected void sendReceipt(PaymentRequest rq) throws Exception {
        System.out.println("📧 Gửi biên lai cho đơn hàng: " + rq.getPaymentId());
        publisher.publishEvent(new UserPaymentEvent(this, rq));
    }
}

