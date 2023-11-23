package concurrency_udemy;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author thanhch
 * <p>
 * Date: 21/11/2023
 * <p>
 * Class: ExecutorDemo
 */
public class ExecutorDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService service = Executors.newSingleThreadExecutor();
//        var listFuture = new ArrayList<Future>();
//        for (int i = 0; i < 10; i++) {
//            MyCallable runnable = new MyCallable(i+1);
//            listFuture.add(service.submit(runnable));
//        }
//        for (Future future : listFuture) {
//            System.out.println(future.get());
//        }
//        service.shutdown();

        var listMyCallable = new ArrayList<MyCallable>();
        for (int i = 0; i < 10; i++) {
            listMyCallable.add(new MyCallable(i + 1));
        }
        var listResult = service.invokeAll(listMyCallable);
        for (Future future: listResult) {
            System.out.println(future.get(1000, TimeUnit.MILLISECONDS));
        }
        service.shutdownNow();
    }
}
