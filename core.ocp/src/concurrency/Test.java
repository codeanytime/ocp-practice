package concurrency;

import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * @author thanhch
 * <p>
 * Date: 16/04/2024
 * <p>
 * Class: Test
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        var es = Executors.newSingleThreadExecutor();
//        Future<String> f = es.submit(() -> "HELLO");
//        System.out.println(f.get());
//        es.shutdown();

        ForkJoinPool pool = new ForkJoinPool();
        File f = new File("/Users/thanhch/Documents/WORK/ocp-practice");
        CalculateFileSize calculateFileSize = new CalculateFileSize(f);
        pool.execute(calculateFileSize);
        System.out.println(calculateFileSize.join());

        long chunkSize = 1024 * 1024; // 1 MB
        long fileSize = pool.invoke(new FileSizeCalculator(f, chunkSize));
        System.out.println("File size: " + fileSize + " bytes");

        FileSizeCalculator fileSizeCalculator = new FileSizeCalculator(f, 1024);
        System.out.println(fileSizeCalculator.compute());
    }
}
