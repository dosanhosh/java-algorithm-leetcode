package com.sh.studyspringboot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceProxy implements OrderService {
    private final OrderService orderService;

    public OrderServiceProxy(@Qualifier("realOrderService") OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void order() {
        long start = System.currentTimeMillis();
        System.out.println("🔍 [LOG] Bắt đầu xử lý đơn hàng...");

        orderService.order(); // gọi real service

        long end = System.currentTimeMillis();
        System.out.println("✅ [LOG] Hoàn tất. Mất " + (end - start) + "ms");
    }

    @Override
    public void processOrder() {

    }

    @Override
    public void processOrderFinish() {

    }
}
