package src.sh.design_pattern.behavioral.strategy.payment;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int money) {
        System.out.println("CreditCardPayment: " + money);
    }
}
