package com.sh.studyspringboot.service;

import com.sh.studyspringboot.aop.annotation.LogExecutionTime;
import org.springframework.stereotype.Service;

public interface OrderService {
    void order();
    void processOrder();
    void processOrderFinish();
}
