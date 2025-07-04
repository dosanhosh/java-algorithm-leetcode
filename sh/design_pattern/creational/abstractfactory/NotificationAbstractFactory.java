package src.sh.design_pattern.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationAbstractFactory {
    // Registry cho từng loại channel
    private static final Map<String, Supplier<NotificationSender>> senderRegistry = new HashMap<>();
    private static final Map<String, Supplier<NotificationLogger>> loggerRegistry = new HashMap<>();

    static {
        senderRegistry.put("email", EmailSender::new);
        loggerRegistry.put("email", EmailLogger::new);

        senderRegistry.put("sms", SMSSender::new);
        loggerRegistry.put("sms", SMSLogger::new);
    }

    public static NotificationSender getSender(String channel) {
        Supplier<NotificationSender> supplier = senderRegistry.get(channel.toLowerCase());
        if (supplier != null) return supplier.get();
        throw new IllegalArgumentException("Unknown sender type: " + channel);
    }

    public static NotificationLogger getLogger(String channel) {
        Supplier<NotificationLogger> supplier = loggerRegistry.get(channel.toLowerCase());
        if (supplier != null) return supplier.get();
        throw new IllegalArgumentException("Unknown logger type: " + channel);
    }
}
