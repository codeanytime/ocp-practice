package working_with_array_collection_2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author thanhch
 * <p>
 * Date: 18/12/2023
 * <p>
 * Class: Q81
 */
public class Q81 {
    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>();
        deque.add('A');
        deque.add('B');
        System.out.println(deque);
        Character c = deque.remove();
        System.out.println("REMOVE " + c);
    }
}
