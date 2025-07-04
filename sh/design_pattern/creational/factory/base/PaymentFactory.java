package src.sh.design_pattern.creational.factory.base;

import src.sh.design_pattern.creational.factory.sevice.Payment;

public abstract class PaymentFactory  {
    public abstract Payment createPayment();
}
