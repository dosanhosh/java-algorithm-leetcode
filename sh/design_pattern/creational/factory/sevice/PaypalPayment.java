package src.sh.design_pattern.creational.factory.sevice;

public class PaypalPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " by Paypal");
    }
}
