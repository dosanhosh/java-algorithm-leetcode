package src.sh.design_pattern.creational.factory;

import src.sh.design_pattern.creational.factory.base.CreditCardPaymentFactory;
import src.sh.design_pattern.creational.factory.base.PaymentFactory;
import src.sh.design_pattern.creational.factory.base.PaypalPaymentFactory;
import src.sh.design_pattern.creational.factory.base.ZaloPayPaymentFactory;
import src.sh.design_pattern.creational.factory.improve.PaymentFactoryJava8;
import src.sh.design_pattern.creational.factory.sevice.Payment;

public class Test {
    public static void main(String[] args) {
//        PaymentFactory factory;
//
//        // Bạn có thể chọn factory theo config, input, hoặc runtime
//        String method = "paypal";
//
//        if (method.equals("credit")) {
//            factory = new CreditCardPaymentFactory();
//        } else if (method.equals("paypal")) {
//            factory = new PaypalPaymentFactory();
//        } else {
//            factory = new ZaloPayPaymentFactory();
//        }
//
//        Payment payment = factory.createPayment();
//        payment.pay(500_000);

        Payment payment1 = PaymentFactoryJava8.getPayment("paypal");
        payment1.pay(100);
    }
}
