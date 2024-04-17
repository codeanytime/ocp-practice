package concurrency;


import java.util.concurrent.RecursiveAction;

/**
 * @author thanhch
 * <p>
 * Date: 18/04/2024
 * <p>
 * Class: Adder
 */
public class Adder extends RecursiveAction {
    private static final int THRESHOLD = 10;
    private int start;
    private int end;
    private int total;

    public Adder(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            total += sum;
        } else {
            int middle = (start + end) >>> 1;
            Adder adderStart = new Adder(start, middle);
            Adder adderEnd = new Adder(middle + 1, end);
            invokeAll(adderStart, adderEnd);
            total = adderStart.total + adderEnd.total;
        }
    }
}
