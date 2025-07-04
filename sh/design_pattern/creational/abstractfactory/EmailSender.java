package src.sh.design_pattern.creational.abstractfactory;

public class EmailSender implements NotificationSender{
    @Override
    public void send(String msg) {
        System.out.println("[Email] " + msg);
    }
}
