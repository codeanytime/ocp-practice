package concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author thanhch
 * <p>
 * Date: 07/10/2023
 * <p>
 * Class: SynchronizedDemo
 */
public class SynchronizedDemo {
    private static int count;

    // one thread can access method at once time
    private synchronized static void incrementCount() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            service.submit(() -> incrementCount());
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println("COUNT: " + count);
    }
}
