package concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * @author thanhch
 * <p>
 * Date: 17/04/2024
 * <p>
 * Class: ImageProcessor
 */
public class ImageProcessor extends RecursiveAction {
    private static final int THRESHOLD = 100; // adjust based on image size
    private int[] pixels;
    private int start, end;

    public ImageProcessor(int[] pixels, int start, int end) {
        this.pixels = pixels;
        this.start = start;
        this.end = end;
    }
    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
            // Perform pixel processing here
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            int middle = (start + end) >>> 1;
            invokeAll(new ImageProcessor(pixels, start, middle),
                    new ImageProcessor(pixels, middle, end));
        }
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        /* initialize image pixels */;
        int[] imagePixels = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ImageProcessor imageProcessor = new ImageProcessor(imagePixels, 0, imagePixels.length);
        forkJoinPool.invoke(imageProcessor);
    }
}
