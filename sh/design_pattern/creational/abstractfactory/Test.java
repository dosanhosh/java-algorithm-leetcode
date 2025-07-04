package src.sh.design_pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        String channel = "sms"; // có thể đổi sang "sms", đọc từ cấu hình

        NotificationSender sender = NotificationAbstractFactory.getSender(channel);
        NotificationLogger logger = NotificationAbstractFactory.getLogger(channel);

        sender.send("Hello from factory!");
        logger.log("Sent notification");
    }
}
