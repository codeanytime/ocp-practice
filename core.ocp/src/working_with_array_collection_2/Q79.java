package working_with_array_collection_2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author thanhch
 * <p>
 * Date: 18/12/2023
 * <p>
 * Class: Q79
 */
public class Q79 {
    public static void main(String[] args) {
        Deque<Boolean> dequeue = new ArrayDeque<>();
        dequeue.push(Boolean.valueOf("TruE"));
        dequeue.push(Boolean.valueOf("FAlse"));
        dequeue.push(Boolean.valueOf("ABC"));
        System.out.println(Boolean.valueOf("CDBIFHEIWH"));
        System.out.println(dequeue.pop());
        System.out.println(dequeue);
    }
}
