package concurrency;

/**
 * @author thanhch
 * <p>
 * Date: 12/04/2024
 * <p>
 * Class: MyRunnable
 */
public class MyRunnable implements Runnable{
    private int threadId;

    public MyRunnable(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadId + " is processing");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + threadId + " done");
    }
}
