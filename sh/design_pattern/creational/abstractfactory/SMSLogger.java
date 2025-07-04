package src.sh.design_pattern.creational.abstractfactory;

public class SMSLogger implements NotificationLogger {
    public void log(String msg) {
        System.out.println("[SMSLog] " + msg);
    }
}