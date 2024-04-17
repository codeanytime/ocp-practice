package concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author thanhch
 * <p>
 * Date: 17/04/2024
 * <p>
 * Class: Fibonnacci
 */
public class Fibonacci extends RecursiveTask<Long> {
    private long n;

    private static final int THRESHOLD = 50; // Threshold for sequential calculation

    public Fibonacci(long n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if (n <= 1) {
            return n;
        } else if (n <= THRESHOLD) {
            return sequentialFibonacci(n);
        } else {
            Fibonacci f1 = new Fibonacci(n - 1);
//            f1.fork();
            Fibonacci f2 = new Fibonacci(n - 2);
            return f1.compute() + f2.compute();
        }
    }

    private long sequentialFibonacci(long n) {
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static boolean isFibonacci(long n) {
        if (n == 0) {
            return true;
        }
        long a = 0, b = 1, c = 1;
        while (c < n) {
            a = b;
            b = c;
            c = a + b;
        }
        return (c == n || isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4));
    }

    public static boolean isPerfectSquare(long n) {
        long root = (int) Math.sqrt(n);
        return (root * root == n);
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        Fibonacci fibonacci = new Fibonacci(90);
        long result = pool.invoke(fibonacci);
        System.out.println(result);
        System.out.println(isFibonacci(2880067194370816120L));
    }
}
