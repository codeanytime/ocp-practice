package working_with_array_collection_2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author thanhch
 * <p>
 * Date: 18/12/2023
 * <p>
 * Class: Q80
 */
public class Q80 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.push("thanh");
        deque.push("is");
        deque.push("name");
        deque.push("my");
        System.out.println(deque);
//        deque.pop();
//        deque.pop();
//        deque.pop();
//        deque.pop();
////        deque.pop(); NoSuchElementException
//        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque);
    }
}
