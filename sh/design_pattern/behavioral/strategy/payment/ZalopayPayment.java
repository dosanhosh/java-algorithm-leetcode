package src.sh.design_pattern.behavioral.strategy.payment;

public class ZalopayPayment implements PaymentStrategy {
    @Override
    public void pay(int money) {
        System.out.println("ZalopayPayment: " + money);
    }
}