package concurrency_udemy;

import java.util.concurrent.Callable;

/**
 * @author thanhch
 * <p>
 * Date: 21/11/2023
 * <p>
 * Class: MyCallable
 */
public class MyCallable implements Callable<String> {
    private int threadId;

    public MyCallable(int threadId) {
        this.threadId = threadId;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Thread " + threadId + " Start");
        Thread.sleep(5000);
        var s = ("" + threadId).repeat(2);
        System.out.println(s);
        return "Thread " + threadId + " End";
    }
}
