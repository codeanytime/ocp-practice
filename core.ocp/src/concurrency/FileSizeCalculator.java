package concurrency;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FileSizeCalculator extends RecursiveTask<Long> {

    private static final long serialVersionUID = 1L;
    private final File file;
    private final long chunkSize;

    public FileSizeCalculator(File file, long chunkSize) {
        this.file = file;
        this.chunkSize = chunkSize;
    }

    @Override
    protected Long compute() {
        if (file.length() <= chunkSize) {
            try {
                return Files.size(file.toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            long midPoint = file.length() / 2;
            FileSizeCalculator leftTask = new FileSizeCalculator(new File(file.getPath(), "1"), chunkSize);
            FileSizeCalculator rightTask = new FileSizeCalculator(new File(file.getPath(), "2"), chunkSize);
            leftTask.fork();
            rightTask.fork();
            return leftTask.join() + rightTask.join();
        }
    }

    public static void main(String[] args) {
        File file = new File("/Users/thanhch/Documents/WORK/ocp-practice");
        long chunkSize = 1024 * 1024; // 1 MB
        ForkJoinPool pool = new ForkJoinPool();
        long fileSize = pool.invoke(new FileSizeCalculator(file, chunkSize));
        System.out.println("File size: " + fileSize + " bytes");

        FileSizeCalculator calculateFileSize = new FileSizeCalculator(file, chunkSize);
        System.out.println(calculateFileSize.chunkSize);
    }
}
