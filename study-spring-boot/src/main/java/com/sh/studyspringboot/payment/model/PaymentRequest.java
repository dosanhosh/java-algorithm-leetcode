package com.sh.studyspringboot.payment.model;

import lombok.*;
import org.springframework.stereotype.Controller;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentRequest {
    private Long paymentId;
    private String type;
    private Double paymentAmount;
}
