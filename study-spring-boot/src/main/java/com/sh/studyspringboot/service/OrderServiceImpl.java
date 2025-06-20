package com.sh.studyspringboot.service;

import com.sh.studyspringboot.aop.annotation.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service("realOrderService")
public class OrderServiceImpl implements OrderService {
    @Override
    public void order() {
        System.out.println("Oder......");
    }


    @LogExecutionTime
    @Override
    public void processOrder() {
        try {
            Thread.sleep(800); // giả lập xử lý
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("✅ Xử lý đơn hàng.....");
        processOrderFinish();
    }

    @LogExecutionTime
    @Override
    public void processOrderFinish() {
        try {
            Thread.sleep(800); // giả lập xử lý
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("✅ Xử lý đơn hàng xong!");
    }
}
