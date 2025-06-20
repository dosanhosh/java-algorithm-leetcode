package src.sh.design_pattern.structure.proxy;

import src.sh.design_pattern.structure.proxy.dynamic.LoggingInvocationHandler;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Service realService = new RealService();
        Service proxyService = new ProxyService(realService);
        proxyService.doTask();
        // Tạo Proxy Runtime
        System.out.println("----------------------------------------");
        Service proxyInstance = (Service) Proxy.newProxyInstance(
                realService.getClass().getClassLoader(),
                new Class[]{Service.class},
                new LoggingInvocationHandler(realService)
        );

        proxyInstance.doTask();
    }
}
