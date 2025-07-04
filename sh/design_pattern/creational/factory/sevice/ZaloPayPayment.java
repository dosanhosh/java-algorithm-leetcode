package src.sh.design_pattern.creational.factory.sevice;

public class ZaloPayPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " by ZaloPay");
    }
}
