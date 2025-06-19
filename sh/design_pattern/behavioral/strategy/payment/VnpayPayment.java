package src.sh.design_pattern.behavioral.strategy.payment;

public class VnpayPayment implements PaymentStrategy {
    @Override
    public void pay(int money) {
        System.out.println("VnpayPayment: " + money);
    }
}