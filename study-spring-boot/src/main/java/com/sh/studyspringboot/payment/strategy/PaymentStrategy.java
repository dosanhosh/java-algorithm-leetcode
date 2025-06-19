package com.sh.studyspringboot.payment.strategy;

import com.sh.studyspringboot.payment.model.PaymentRequest;
import org.springframework.stereotype.Component;

@Component
public interface PaymentStrategy {
    void pay(PaymentRequest paymentRequest);
}
