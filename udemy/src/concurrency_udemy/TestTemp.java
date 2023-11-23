package concurrency_udemy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author thanhch
 * <p>
 * Date: 19/11/2023
 * <p>
 * Class: TestTemp
 */
public class TestTemp {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        Runnable task2 = () -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        try {
            service = Executors.newSingleThreadExecutor();
            service.execute(task2);
            service.execute(task2);
            service.execute(task2);
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
        boolean complete = service.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println(complete);
        System.out.println("DONE");
    }
}
