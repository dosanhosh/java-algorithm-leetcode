package com.sh.studyspringboot.event.listener;

import com.sh.studyspringboot.event.UserRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class PhoneListener {

    @EventListener
    @Order(2)
    public void onUserRegistered(UserRegisteredEvent event) {
        System.out.println("📝 Gửi Phone cho - " + event.getUsername());
    }
}
