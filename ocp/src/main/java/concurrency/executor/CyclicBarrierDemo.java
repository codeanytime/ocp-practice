package concurrency.executor;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 06/10/2023
 * <p>
 * Class: CyclicBarrier
 */
public class CyclicBarrierDemo {
    private void removeAnimals() { System.out.println("Removing animals - " + Thread.currentThread().getName()); }
    private void cleanPen() { System.out.println("Cleaning the pen - " +  Thread.currentThread().getName()); }
    private void addAnimals() { System.out.println("Adding animals" +  Thread.currentThread().getName()); }
    public void performTask(CyclicBarrier c1, CyclicBarrier c2) throws BrokenBarrierException, InterruptedException {
        removeAnimals();
        c1.await();
        cleanPen();
        c2.await();
        addAnimals();
    }
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        final CyclicBarrier c = new CyclicBarrier(4);
        CyclicBarrier c2 = new CyclicBarrier(4);
        try {
            service = Executors.newFixedThreadPool(4);
            CyclicBarrierDemo manager = new CyclicBarrierDemo();
            for(int i=0; i<4; i++)
                service.submit(() -> {
                    try {
                        manager.performTask(c, c2);
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
        } finally {
            if(service != null) service.shutdown();
        }
        service.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("END");
        System.out.println(Arrays.asList("w","o","l","f")
                .parallelStream()
                .reduce("X",String::concat));
    }
}
