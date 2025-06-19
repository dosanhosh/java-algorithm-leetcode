package src.sh.multithread;

import java.util.concurrent.*;

public class LectureExecutorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            Thread.sleep(1000); // simulate work
            return "Result from callable!";
        };

        Future<String> future = executor.submit(task);

        System.out.println("Doing other stuff...");
        String result = future.get(); // waits for result

        System.out.println("Received: " + result);
        executor.shutdown();
    }
}
