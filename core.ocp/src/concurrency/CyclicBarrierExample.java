package concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author thanhch
 * <p>
 * Date: 21/04/2024
 * <p>
 * Class: CyclicBarrierExample
 */
public class CyclicBarrierExample {


    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        MyRunnable1 runnable = new MyRunnable1();
        CyclicBarrier cb = new CyclicBarrier(2, runnable);
        service.execute(new Player(cb));
        service.execute(runnable);
        service.execute(runnable);
        cb.reset();
        if (service != null) {
            service.shutdown();
        }
    }
}

class Player extends Thread {
    CyclicBarrier cyclicBarrier;

    public Player(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            cyclicBarrier.await();
            System.out.println("WAITING:" + cyclicBarrier.getNumberWaiting());
        } catch (InterruptedException | BrokenBarrierException e) {

        }
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("My runnable start");
    }
}
