package src.sh.design_pattern.behavioral.strategy.service;

import src.sh.design_pattern.behavioral.strategy.payment.CreditCardPayment;
import src.sh.design_pattern.behavioral.strategy.payment.PaymentStrategy;
import src.sh.design_pattern.behavioral.strategy.payment.VnpayPayment;
import src.sh.design_pattern.behavioral.strategy.payment.ZalopayPayment;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private Map<String, PaymentStrategy> mapPaymentStrategy = new HashMap<>();

    public PaymentService() {
        mapPaymentStrategy.put("creditCard", new CreditCardPayment());
        mapPaymentStrategy.put("zalopay", new ZalopayPayment());
        mapPaymentStrategy.put("vnpay", new VnpayPayment());
    }

    public void process(String type, int money) {
        PaymentStrategy paymentStrategy = mapPaymentStrategy.get(type);
        if (paymentStrategy == null) throw new NullPointerException("ERROR");
        mapPaymentStrategy.get(type).pay(money);
    }
}
