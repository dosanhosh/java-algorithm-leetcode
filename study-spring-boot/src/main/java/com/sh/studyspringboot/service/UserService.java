package com.sh.studyspringboot.service;

import com.sh.studyspringboot.event.UserRegisteredEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final ApplicationEventPublisher publisher;

    @Autowired
    public UserService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void registerUser(String username) {
        // logic tạo user...
        System.out.println("🧑 Đã đăng ký người dùng: " + username);

        // phát sự kiện
        publisher.publishEvent(new UserRegisteredEvent(this, username));
    }
}