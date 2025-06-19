package src.sh.multithread;

public class LectureSynchronized {
    public static class Shared {
        synchronized void waitMethod() throws InterruptedException {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait();
            System.out.println(Thread.currentThread().getName() + " resumed!");
        }

        synchronized void notifyMethod() {
            notify(); // hoặc notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Shared shared = new Shared();

        Runnable waiter = () -> {
            try {
                shared.waitMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(waiter, "Thread-1");
        Thread t2 = new Thread(waiter, "Thread-2");

        t1.start();
        t2.start();

        Thread.sleep(1000); // chờ cho 2 thread vào wait
        synchronized (shared) {
            shared.notifyMethod(); // chỉ đánh thức 1 thread
//            shared.notifyAll(); // để đánh thức cả 2 thread
        }
    }
}
