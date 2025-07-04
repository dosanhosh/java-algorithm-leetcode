package src.sh.design_pattern.creational.factory.sevice;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " by Credit Card");
    }
}
