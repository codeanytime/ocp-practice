package concurrency;

import java.util.concurrent.Callable;

/**
 * @author thanhch
 * <p>
 * Date: 12/04/2024
 * <p>
 * Class: MyCallable
 */
public class MyCallable implements Callable {
    private int threadId;

    public MyCallable(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public String call() {
        System.out.println("Callable " + threadId + " is processing");
        try {
            Thread.sleep(1000 * threadId);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread " + threadId + " is done");
        return "Callable " + threadId + " done";
    }
}
