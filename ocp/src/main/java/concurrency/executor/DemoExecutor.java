package concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
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

    static synchronized void increaseNumExec() {
        numExec++;
    }
    public static void main(String[] args) {
        AtomicInteger countExecute = new AtomicInteger(0);
        ExecutorService service = Executors.newFixedThreadPool(10);
        try {
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo inventory"));
            for (int i = 0; i < 100; i++) {
                final int j = i;
                service.submit(() -> {
                    countExecute.getAndIncrement();
                    increaseNumExec();
                    System.out.println(j);
                });
            }
            service.submit(() -> {
                System.out.println("hi");
            });
            service.submit(() -> System.out.println("Printing zoo inventory"));

            // wait to complete all task
            service.awaitTermination(1, TimeUnit.MINUTES);

            // Check
            if(service.isTerminated())
                System.out.println("All tasks finished");
            else
                System.out.println("At least one task is still running");


            System.out.println("end");
            System.out.println("NUMBER CALL : " + countExecute);
            System.out.println("NUMBER EXEC static: " + numExec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
