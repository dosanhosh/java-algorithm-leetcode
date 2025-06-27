package src.sh.design_pattern.creational.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Constructor called by " + Thread.currentThread().getName());
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            // Giả lập delay để tăng xác suất lỗi
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            instance = new LazySingleton();
        }
        return instance;
    }


    public void printMessage() {
        System.out.println("LazySingleton");
    }
}
