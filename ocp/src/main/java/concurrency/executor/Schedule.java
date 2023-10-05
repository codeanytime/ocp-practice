package concurrency.executor;

import java.util.concurrent.*;

/**
 * @author thanhch
 * <p>
 * Date: 05/10/2023
 * <p>
 * Class: Schedule
 */
public class Schedule {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        Runnable task1 = () -> System.out.println("task 1 running");
        Runnable task2 = () -> System.out.println("task 2 running");

        service.schedule(task1, 10, TimeUnit.SECONDS);
        for (int i = 0; i < 1000; i++) {
            service.schedule(task2, 1, TimeUnit.SECONDS);
        }
        if (service != null) {
            service.shutdown();
        }
        System.out.println("FINISH");
    }
}
