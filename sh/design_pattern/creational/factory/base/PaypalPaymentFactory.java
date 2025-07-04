package src.sh.design_pattern.creational.factory.base;

import src.sh.design_pattern.creational.factory.sevice.Payment;
import src.sh.design_pattern.creational.factory.sevice.PaypalPayment;

public class PaypalPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PaypalPayment();
    }
}
