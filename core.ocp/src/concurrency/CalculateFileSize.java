package concurrency;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * @author thanhch
 * <p>
 * Date: 16/04/2024
 * <p>
 * Class: CalculateFileSize
 */
public class CalculateFileSize extends RecursiveTask<Long> {
    private final File file;

    public CalculateFileSize(File file) {
        this.file = file;
    }

    @Override
    protected Long compute() {
        if (file.isFile()) {
            return file.length();
        }
        File[] children = file.listFiles();
        final List<CalculateFileSize> tasks = new ArrayList<>();
        if (children != null) {
            for (final File f: children) {
                final CalculateFileSize task = new CalculateFileSize(f);
                task.fork();
                tasks.add(task);
            }
        }
        long totalSize = 0;
        for (CalculateFileSize task: tasks) {
            totalSize += task.join();
        }
        return totalSize;
    }
}
