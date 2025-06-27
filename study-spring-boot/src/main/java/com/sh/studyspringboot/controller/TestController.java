package com.sh.studyspringboot.controller;

import com.sh.studyspringboot.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singleton")
public class TestController {
    @Autowired
    private MyService service1;

    @Autowired
    private MyService service2;

    @GetMapping("/test")
    public String test() {
        System.out.println("service1 hash: " + service1.hashCode());
        System.out.println("service2 hash: " + service2.hashCode());
        return "OK";
    }
}
