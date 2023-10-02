package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 02/10/2023
 * <p>
 * Class: Main
 */
public class DemoCompleteFuture {
    static AtomicInteger countError = new AtomicInteger(0);
    public static void main(String[] args) throws Exception {
        List<Integer> numExecList = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            numExecList.add(i + 1);
        }
        List<Integer> execList = numExecList.parallelStream().filter(i -> i < 101).collect(Collectors.toList());
        List<CompletableFuture<String>> runningList = execList.stream().map(i -> {
            try {
                return asyncTask(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());

        CompletableFuture<Void> complete = CompletableFuture.allOf
                (runningList.toArray(new CompletableFuture[execList.size()]));
        complete.get();
        System.out.println("hi");
        System.out.println("Number error" + countError);
    }

    private static CompletableFuture<String> asyncTask(int i) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("hello");
                TimeUnit.SECONDS.sleep(1);
                if (i % 2 == 0) {
                    int a = i/0;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Running async task";
        }).handleAsync((data, err) -> {
            if (err != null) {
                System.out.println("ERROR");
                countError.incrementAndGet();
            } else {
                System.out.println("processed complete");
            }
            return null;
        });
    }

    private static void longTimeRunMethod() throws InterruptedException {
        System.out.println("running in long time method");
        TimeUnit.SECONDS.sleep(10);
    }
}
