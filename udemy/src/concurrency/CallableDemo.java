package concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author thanhch
 * <p>
 * Date: 16/11/2023
 * <p>
 * Class: CallableDemo
 */
public class CallableDemo {
    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(10);
        var listFuture = new ArrayList<Future>();
        for (var i = 0; i < 10; i++) {
            var thread = new MyThread("thread " + i);
            var f = service.submit(thread);
            listFuture.add(f);
        }

        service.shutdown();
    }
}
