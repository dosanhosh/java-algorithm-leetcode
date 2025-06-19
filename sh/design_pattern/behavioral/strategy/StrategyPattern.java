package src.sh.design_pattern.behavioral.strategy;

import src.sh.design_pattern.behavioral.strategy.payment.PaymentStrategy;
import src.sh.design_pattern.behavioral.strategy.service.PaymentService;

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.process("vnpay", 1000000);
    }
}

