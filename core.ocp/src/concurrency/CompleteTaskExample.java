package concurrency;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author thanhch
 * <p>
 * Date: 12/04/2024
 * <p>
 * Class: CompleteTaskExample
 */
public class CompleteTaskExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService WORKER_THREAD_POOL = Executors.newFixedThreadPool(5);

//        CompletionService service = new ExecutorCompletionService(WORKER_THREAD_POOL);
//        for (int i = 0; i < 10; i++) {
//            service.submit(new MyCallable(i));
//        }
//        if (WORKER_THREAD_POOL != null) {
//            WORKER_THREAD_POOL.shutdown();
//        }

//        List<Callable<String>> allCallables = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            allCallables.add(new MyCallable(i));
//        }
//        try {
//            WORKER_THREAD_POOL.invokeAll(allCallables);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            if (WORKER_THREAD_POOL != null) {
//                WORKER_THREAD_POOL.shutdown();
//            }
//        }


        long endTime = System.currentTimeMillis();
        System.out.println("Worked time: " + Duration.ofMillis(endTime - startTime).getSeconds() +  " second");

    }
}
