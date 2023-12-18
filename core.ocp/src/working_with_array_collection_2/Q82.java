package working_with_array_collection_2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author thanhch
 * <p>
 * Date: 18/12/2023
 * <p>
 * Class: Q82
 */
public class Q82 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(1);
        deque.add(99);
        deque.add(100);
        deque.add(-1);
    }
}
