package com.sh.studyspringboot.controller;

import com.sh.studyspringboot.payment.model.PaymentRequest;
import com.sh.studyspringboot.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<?> payment(@RequestBody PaymentRequest paymentRequest) throws Exception {
        paymentService.process(paymentRequest);
        paymentService.notify(paymentRequest);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/v2")
    public ResponseEntity<?> paymentv2(@RequestBody PaymentRequest paymentRequest) throws Exception {
        paymentService.process(paymentRequest);
        return ResponseEntity.ok().build();
    }

}
