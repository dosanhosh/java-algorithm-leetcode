package src.sh.design_pattern.creational.factory.improve;

import src.sh.design_pattern.creational.factory.sevice.CreditCardPayment;
import src.sh.design_pattern.creational.factory.sevice.Payment;
import src.sh.design_pattern.creational.factory.sevice.PaypalPayment;
import src.sh.design_pattern.creational.factory.sevice.ZaloPayPayment;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactoryJava8 {

    private static final Map<String, Supplier<Payment>> registry = new HashMap<>();

    static {
        registry.put("credit", CreditCardPayment::new);
        registry.put("paypal", PaypalPayment::new);
        registry.put("vnpay", ZaloPayPayment::new);
    }

    public static Payment getPayment(String type) {
        Supplier<Payment> supplier = registry.get(type.toLowerCase());
        if (supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Unsupported payment method: " + type);
    }
}
