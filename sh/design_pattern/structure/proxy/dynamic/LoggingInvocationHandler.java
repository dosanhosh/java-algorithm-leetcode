package src.sh.design_pattern.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {

    private final Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("🔒 Kiểm tra quyền truy cập...");
        System.out.println("📝 Logging: gọi method " + method.getName());

        Object result = method.invoke(target, args);  // gọi method thật

        System.out.println("✅ Ghi log hoàn tất.");
        return result;
    }
}
