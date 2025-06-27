package src.sh.design_pattern.creational.singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void printMessage() {
        System.out.println("EagerSingleton");
    }
}
