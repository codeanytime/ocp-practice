package working_with_array_collection_2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author thanhch
 * <p>
 * Date: 18/12/2023
 * <p>
 * Class: Q78
 */
public class Q78 {
    public static void main(String[] args) {
        Deque<String> deQueue = new ArrayDeque<>();
        deQueue.add("A");
        deQueue.add("a");
        deQueue.add("B");
        deQueue.offer("D");
        System.out.println(deQueue);
        deQueue.removeFirst();
        deQueue.removeLast();
        deQueue.addFirst("Thanhch");
        deQueue.addLast("Huy");
        System.out.println(deQueue);
    }
}
