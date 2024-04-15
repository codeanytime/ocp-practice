package concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author thanhch
 * <p>
 * Date: 15/04/2024
 * <p>
 * Class: CopyOnWriteArrayListExample
 */
public class CopyOnWriteArrayListExample {
    public static void main(String[] args) throws InterruptedException {
        List<String> input = Arrays.asList("Melon", "Banana", "Apple", "Mango");
        List<String> list = new CopyOnWriteArrayList<>(input);
        for (String s: list) {
            list.removeIf(str -> str.startsWith("M"));
            System.out.println(s);
        }

        Callable<String> c = () -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        };
        ExecutorService service = Executors.newFixedThreadPool(5);
        List<Future<String>> futures = service.invokeAll(Arrays.asList(c, c, c, c, c));
        System.out.println(futures.size());
    }
}
