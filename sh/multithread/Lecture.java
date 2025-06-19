package src.sh.multithread;

public class Lecture {

    public static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread đang chạy!");
        }

    }

    public static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Runnable đang chạy!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(i);
                    Thread.sleep(500);
                } catch (Exception ex) {
                    throw new RuntimeException("error" + ex);
                }
            }
        });
        t.start();
        System.out.println(t.isAlive());
        t.join();
        System.out.println(t.isAlive());


        MyThread myThread = new MyThread();
        myThread.start();

    }
}
