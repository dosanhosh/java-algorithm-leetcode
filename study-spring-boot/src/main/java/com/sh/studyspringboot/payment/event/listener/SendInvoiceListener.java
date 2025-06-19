package com.sh.studyspringboot.payment.event.listener;

import com.sh.studyspringboot.payment.event.UserPaymentEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SendInvoiceListener {

    @EventListener
    public void sendInvoice(UserPaymentEvent event) {
        System.out.println("SendInvoiceListener" + event.getPaymentRequest().toString());
    }
}
