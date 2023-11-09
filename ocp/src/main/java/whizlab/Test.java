package whizlab;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author thanhch
 * <p>
 * Date: 13/11/2023
 * <p>
 * Class: Test
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        Runnable task2 = () -> {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("run " + i);
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
        System.out.println(service.awaitTermination(10, TimeUnit.SECONDS));
        System.out.println("DONE");
    }
}
