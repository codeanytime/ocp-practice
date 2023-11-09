package exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 09/11/2023
 * <p>
 * Class: ConcurrencyTest
 */
public class ConcurrencyTest {
    static ExecutorService executor = Executors.newFixedThreadPool(2);
    public static void main(String[] args) {
        List<Integer> inputRaw = Stream.iterate(1, n -> n + 1).limit(10).collect(Collectors.toList());
        long start = System.currentTimeMillis();
        List<List<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1, 2)));
        input.add(new ArrayList<>(Arrays.asList(3, 4)));
        input.add(new ArrayList<>(Arrays.asList(5, 6)));
        input.add(new ArrayList<>(Arrays.asList(7, 8)));
        input.add(new ArrayList<>(Arrays.asList(9, 10)));

        input.stream().forEach(i -> {
            try {
                merge(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        if (executor != null) executor.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("TOTAL time: " + (end - start)/1000 + " SECOND");
    }

    static void merge(List<Integer> inputData) throws InterruptedException {
        List<CompletableFuture<Void>> listFuture = new ArrayList<>();
        inputData.forEach(i -> {
            listFuture.add(CompletableFuture.supplyAsync(() -> {
                longRunning(i);
                return null;
            }, executor));
        });
        CompletableFuture<Void> mergeFuturePartion = CompletableFuture.allOf(listFuture.toArray(new CompletableFuture[0]));
        mergeFuturePartion.join();
        TimeUnit.SECONDS.sleep(5);
    }

    static CompletableFuture<Void> longRunning(Integer i) {
        CompletableFuture<Void> execute = CompletableFuture.runAsync(() -> {
            System.out.println("Number " + i);
            System.out.println("ACTIVE THREAD " + Thread.activeCount());
        });
        return execute;
    }
}
