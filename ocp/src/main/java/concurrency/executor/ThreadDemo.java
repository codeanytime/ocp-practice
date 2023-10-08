package concurrency.executor;

/**
 * @author thanhch
 * <p>
 * Date: 07/10/2023
 * <p>
 * Class: ThreadDemo
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println(Thread.currentThread().getName()));

        // new Thread
        t.start();

        // in main thread
        t.run();
    }
}
