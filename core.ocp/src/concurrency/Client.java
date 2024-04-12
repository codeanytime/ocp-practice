package concurrency;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author thanhch
 * <p>
 * Date: 12/04/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService service = Executors.newFixedThreadPool(10);

//        for (int i = 0; i < 10; i++) {
//            service.execute(new MyRunnable(i));
//        }
//        if (service != null) {
//            service.shutdown();
//        }

//        List<Future> allFuture = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Future future = service.submit(new MyRunnable(i));
//            allFuture.add(future);
//        }
//        for (Future future: allFuture) {
//            System.out.println(future.get());
//        }

        List<Callable<String>> allCallables = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            allCallables.add(new MyCallable(i));
        }
        List<Future<String>> allFuture = service.invokeAll(allCallables);
        for (Future f: allFuture) {
            System.out.println(f.get());
        }
        if (service != null) {
            service.shutdown();
            service.awaitTermination(1, TimeUnit.SECONDS);
            if (service.isTerminated()) {
                System.out.println("All done");
            }
        }

//        List<Callable<String>> allCallables = new ArrayList<>();
//        String resultAfterRunAnything;
//        for (int i = 0; i < 10; i++) {
//            allCallables.add(new MyCallable(i));
//        }
//        resultAfterRunAnything = service.invokeAny(allCallables);
//        System.out.println(resultAfterRunAnything);
//        service.shutdown();
//        System.out.println("------" + service.isShutdown());
        long endTime = System.currentTimeMillis();
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
    }
}
