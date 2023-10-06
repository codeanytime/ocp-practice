package concurrency.executor;

import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 05/10/2023
 * <p>
 * Class: ConcurrentCollection
 */
public class ConcurrentCollection {



//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
//        Map<String, Integer> map = new ConcurrentHashMap<>();
//        map.put("thanh", 1);
//        map.put("huy", 2);
//        for (String i : map.keySet()) {
//            map.remove(i);
//        }
//        for (String i : map.keySet()) {
//            System.out.println(map.get(i));
//        }

        testMethod();
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @BenchmarkMode(Mode.Throughput)
//    @Warmup(iterations = 1)
    public static void testMethod() {
        long start = System.currentTimeMillis();
        List<Integer> test = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            test.add(i);
        }

        List<Integer> result = test.parallelStream().filter(i -> {
            try {
                return callApi(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return false;
        }).collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start)/1000.0000 + "s");
    }

    public static boolean callApi(int i) throws InterruptedException {
//        TimeUnit.MILLISECONDS.sleep(1);
        return i % 2 == 0;
    }
}
