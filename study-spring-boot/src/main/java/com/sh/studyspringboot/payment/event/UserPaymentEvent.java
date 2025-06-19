package com.sh.studyspringboot.payment.event;

import com.sh.studyspringboot.payment.model.PaymentRequest;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Getter
public class UserPaymentEvent extends ApplicationEvent {

    private final PaymentRequest paymentRequest;

    public UserPaymentEvent(Object source, PaymentRequest paymentRequest) {
        super(source);
        this.paymentRequest = paymentRequest;
    }
}
