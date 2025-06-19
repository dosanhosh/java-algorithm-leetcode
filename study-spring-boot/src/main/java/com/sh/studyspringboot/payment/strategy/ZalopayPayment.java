package com.sh.studyspringboot.payment.strategy;

import com.sh.studyspringboot.payment.model.PaymentRequest;
import org.springframework.stereotype.Component;

@Component
public class ZalopayPayment implements PaymentStrategy {
    @Override
    public void pay(PaymentRequest paymentRequest) {
        System.out.println(this.getClass() + ":" + paymentRequest.toString());
    }
}