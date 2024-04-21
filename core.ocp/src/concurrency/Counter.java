package concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author thanhch
 * <p>
 * Date: 22/04/2024
 * <p>
 * Class: Counter
 */
public class Counter implements Runnable{
    private static int i = 3;
    private static final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        System.out.print(i--);
        lock.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(new Counter());
        var t2 = new Thread(new Counter());
        var t3 = new Thread(new Counter());
        var threads = new Thread[] {t1, t2, t3};
        for (var thread: threads) {
            thread.start();
//            thread.join();
        }
    }
}
