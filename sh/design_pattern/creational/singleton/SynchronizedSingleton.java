package src.sh.design_pattern.creational.singleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        System.out.println("Constructor called by " + Thread.currentThread().getName());
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }


    public void printMessage() {
        System.out.println("SynchronizedSingleton");
    }
}
