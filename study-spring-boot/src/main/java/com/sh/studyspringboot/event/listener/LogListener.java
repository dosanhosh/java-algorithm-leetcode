package com.sh.studyspringboot.event.listener;

import com.sh.studyspringboot.event.UserRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class LogListener {
    @EventListener
    @Order(100)
    public void logUserRegistration(UserRegisteredEvent event) {
        System.out.println("📝 Ghi log: Người dùng mới - " + event.getUsername());
    }
}