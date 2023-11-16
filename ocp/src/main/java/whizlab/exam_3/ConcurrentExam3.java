package whizlab.exam_3;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author thanhch
 * <p>
 * Date: 14/11/2023
 * <p>
 * Class: ConcurrentExam3
 */
public class ConcurrentExam3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Callable<String> task1 = () -> "Task 1 complete";
        Callable<String> task2 = () -> {
            throw new RuntimeException();
        };
        Callable<String> task3 = () -> {
            Thread.sleep(10000);
            return null;
        };
        var result = service.invokeAll(List.of(task1, task2, task3));
        System.out.println("HELLO EXAM 3");
        System.out.println(result.get(0).get());
        service.shutdown();
    }
}
