package src.sh.design_pattern.creational.abstractfactory;

public class SMSSender implements NotificationSender{
    @Override
    public void send(String msg) {
        System.out.println("[SMS] " + msg);
    }
}
