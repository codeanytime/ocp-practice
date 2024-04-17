package concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author thanhch
 * <p>
 * Date: 17/04/2024
 * <p>
 * Class: CalculateSumBig
 */
public class CalculateSumBig extends RecursiveTask<Long> {
    private static final int THRESHOLD = 100000;
    private int start;
    private int end;

    public CalculateSumBig(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start < THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += i;
            }
            return sum;
        } else {
            int middle = (start + end) >>> 1;
            CalculateSumBig f1 = new CalculateSumBig(start, middle);
            f1.fork();
            CalculateSumBig f2 = new CalculateSumBig(middle, end);
            return f2.compute() + f1.join();
        }
    }

    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i < 1000_0000; i++) {
            sum += i;
        }
        System.out.println("SUM 1: " + sum);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CalculateSumBig calculateSumBig = new CalculateSumBig(0, 1000_0000);
        forkJoinPool.invoke(calculateSumBig);
        System.out.println("SUM 2: " + calculateSumBig.compute());
    }
}
