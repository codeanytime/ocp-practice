package concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author thanhch
 * <p>
 * Date: 03/10/2023
 * <p>
 * Class: DemoExecutor
 */
public class DemoExecutor {
    static int numExec = 0;
    public static void main(String[] args) {
        AtomicInteger countExecute = new AtomicInteger(0);
        ExecutorService service = Executors.newFixedThreadPool(10);
        try {
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo inventory"));
            for (int i = 0; i < 100; i++) {
                final int j = i;
                service.submit(() -> {
                    countExecute.incrementAndGet();
                    numExec++;
                    System.out.println(j);
                });
            }
            service.submit(() -> {
                System.out.println("hi");
            });
            service.submit(() -> System.out.println("Printing zoo inventory"));
            System.out.println("end");
            System.out.println("NUMBER CALL : " + countExecute);
            System.out.println("NUMBER EXEC static: " + numExec);
        } finally {
            service.shutdown();
        }
    }
}
