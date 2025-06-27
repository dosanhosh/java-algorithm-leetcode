package src.sh.design_pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.printMessage();


//        Runnable task = () -> {
//            LazySingleton instance = LazySingleton.getInstance();
//            System.out.println("Instance hash: " + instance.hashCode() + " | Thread: " + Thread.currentThread().getName());
//        };
//        Thread t1 = new Thread(task, "T1");
//        Thread t2 = new Thread(task, "T2");
//        t1.start();
//        t2.start();


        // Synchronized
//        Runnable task = () -> {
//            SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
//            System.out.println("Instance hash: " + synchronizedSingleton.hashCode() + " | Thread: " + Thread.currentThread().getName());
//        };
//        Thread t1 = new Thread(task, "T1");
//        Thread t2 = new Thread(task, "T2");
//        t1.start();
//        t2.start();

        // Double-Checked Locking

//        Runnable task = () -> {
//            DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance();
//            System.out.println("Instance hash: " + doubleCheckedLockingSingleton.hashCode() + " | Thread: " + Thread.currentThread().getName());
//        };
//        Thread t1 = new Thread(task, "T1");
//        Thread t2 = new Thread(task, "T2");
//        t1.start();
//        t2.start();

        // HolderSingleton



        Runnable task = () -> {
            HolderSingleton holderSingleton = HolderSingleton.getInstance();
            System.out.println("Instance hash: " + holderSingleton.hashCode() + " | Thread: " + Thread.currentThread().getName());
        };
        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        t1.start();
        t2.start();
    }
}
