package src.sh.design_pattern.structure.proxy;

public class ProxyService implements Service {

    private final Service service;

    public ProxyService(Service service) {
        this.service = service;
    }

    @Override
    public void doTask() {
        LogAccess();
        service.doTask();
        System.out.println("Finish write log");
    }

    private void LogAccess() {
        System.out.println("📝 Write log access time: " + java.time.LocalDateTime.now());
    }
}
