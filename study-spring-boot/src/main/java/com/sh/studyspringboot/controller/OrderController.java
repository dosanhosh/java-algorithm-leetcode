package com.sh.studyspringboot.controller;

import com.sh.studyspringboot.service.OrderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final OrderService orderServiceImpl;

    public OrderController(@Qualifier("orderServiceProxy") OrderService orderService,
                           @Qualifier("realOrderService") OrderService orderServiceImpl) {
        this.orderService = orderService;
        this.orderServiceImpl = orderServiceImpl;
    }

    @PostMapping
    public ResponseEntity<String> order() {
        orderService.order();
        return ResponseEntity.ok("Order registered successfully");
    }

    @PostMapping("/v2")
    public ResponseEntity<String> orderV2() {
        orderServiceImpl.processOrder();
        return ResponseEntity.ok("Order registered successfully");
    }
}
