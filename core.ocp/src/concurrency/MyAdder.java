package concurrency;

/**
 * @author thanhch
 * <p>
 * Date: 21/04/2024
 * <p>
 * Class: MyAdder
 */
import java.util.concurrent.*;

class MyAdder1 extends RecursiveAction {
    private int from;
    private int to;
    int total = 0;

    MyAdder1(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected void compute() {
        if ((to - from) <= 4) {
            int sum = 0;
            for(int i = from; i <= to; i++) {
                sum += i;
            }
            total+=sum;
        } else {
            int mid = (from + to) / 2;
            MyAdder1 first = new MyAdder1(from, mid);
            MyAdder1 second = new MyAdder1(mid + 1, to);
            invokeAll(first, second);
            total = first.total + second.total;
        }
    }
}

public class MyAdder {
    public static void main(String[] args) {
        MyAdder1 adder = new MyAdder1(1, 100000); //Line 34
        ForkJoinPool pool = new ForkJoinPool(4);
        pool.invoke(adder);
        System.out.println(adder.total);
    }
}
