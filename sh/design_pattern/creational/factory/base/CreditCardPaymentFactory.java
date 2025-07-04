package src.sh.design_pattern.creational.factory.base;

import src.sh.design_pattern.creational.factory.sevice.CreditCardPayment;
import src.sh.design_pattern.creational.factory.sevice.Payment;

public class CreditCardPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
