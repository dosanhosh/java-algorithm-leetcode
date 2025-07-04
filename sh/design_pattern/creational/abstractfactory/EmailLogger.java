package src.sh.design_pattern.creational.abstractfactory;

public class EmailLogger implements NotificationLogger{
    @Override
    public void log(String msg) {
        System.out.println("[EmailLog] " + msg);
    }
}
