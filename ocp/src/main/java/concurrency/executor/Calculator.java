package concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author thanhch
 * <p>
 * Date: 05/10/2023
 * <p>
 * Class: Calculator
 */
public class Calculator {
    static int total;
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger sumAll = new AtomicInteger(0);
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(10);
            for (int i = 0; i < 1000; i++) {
                final int j = i + 1;
                service.submit(() -> {
                    total += j;
                    sumAll.addAndGet(j);
                });
            }
        } finally {
            if (service != null) service.shutdown();
        }
        service.awaitTermination(1, TimeUnit.MICROSECONDS);
        if(service.isTerminated())
            System.out.println("All tasks finished");
        else
            System.out.println("At least one task is still running");
        System.out.println("SUM: " + total);
        System.out.println("SUM ALL: " + sumAll);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

