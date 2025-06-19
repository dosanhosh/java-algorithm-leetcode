package com.sh.studyspringboot.payment.event.listener;

import com.sh.studyspringboot.payment.event.UserPaymentEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotifyWarehouseListener {


    @EventListener
    public void notifyWarehouse(UserPaymentEvent event) {
        System.out.println("NotifyWarehouseListener:" + event.getPaymentRequest().toString());
    }
}
