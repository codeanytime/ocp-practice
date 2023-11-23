package concurrency_udemy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * @author thanhch
 * <p>
 * Date: 20/11/2023
 * <p>
 * Class: Demo
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> r = () -> {
            int sum = 0;
//            Thread.sleep(5000);
            for (int i = 0; i < 1000; i++) {
                sum += i;
            }
            System.out.println("end callable");
            return sum + "";
        };
        var es = Executors.newSingleThreadExecutor();
        var f = es.submit(r);
        System.out.println(f.get());

        es.shutdown();
//        System.out.println(es.isShutdown());
//        System.out.println(es.isTerminated());
    }
}
