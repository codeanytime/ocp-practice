package working_with_array_collection;

import java.util.function.Supplier;

/**
 * @author thanhch
 * <p>
 * Date: 13/12/2023
 * <p>
 * Class: Q71
 */
public class Q71<T> {
    final Supplier<? extends T[]> t;

    public Q71(Supplier<? extends T[]> t) {
        this.t = t;
//        this.t = new T[100];
//        this.t = (T[]) new Object[100];
    }

    public Supplier<? extends T[]> getT() {
        return t;
    }

    public static void main(String[] args) {
        Q71<Integer> q71 = new Q71<>(() -> new Integer[100]);
        Object object = q71.getT().get();
//        System.out.println(q71.getT());
    }
}
