package src.sh.design_pattern.creational.singleton;

public class HolderSingleton {
    private HolderSingleton() {
        System.out.println("Khởi tạo bởi: " + Thread.currentThread().getName());
    }

    private static class Holder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
