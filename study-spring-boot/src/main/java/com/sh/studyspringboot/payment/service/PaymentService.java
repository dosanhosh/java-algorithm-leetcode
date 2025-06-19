package com.sh.studyspringboot.payment.service;

import com.sh.studyspringboot.payment.model.PaymentRequest;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    void process(PaymentRequest paymentRequest) throws Exception;
    void notify(PaymentRequest paymentRequest) throws Exception;
}
