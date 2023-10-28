package generic_and_collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * @author thanhch
 * <p>
 * Date: 28/10/2023
 * <p>
 * Class: QueueDemo
 */
public class QueueDemo {
    static int count = 0;
    public static void main(String[] args) {
        ArrayDeque<Integer> queueInteger = new ArrayDeque<>();
        queueInteger.add(1);
        queueInteger.add(2);
        printCollection(queueInteger);

        queueInteger.poll();
        printCollection(queueInteger);

        // Offer add in back of queue
        queueInteger.offer(1);
        queueInteger.offer(10);
        printCollection(queueInteger);

        // Poll remove and return next element
        System.out.println("Remove poll " + queueInteger.poll());
        System.out.println("Remove poll " + queueInteger.poll());
        printCollection(queueInteger);

        // push add in front queue - push is not in common queue
        queueInteger.push(99);
        queueInteger.push(11);
        printCollection(queueInteger);
        queueInteger.offer(999);
        printCollection(queueInteger);

        // peek return next element in queue (HEAD)
        System.out.println("Peek " + queueInteger.peek());
        printCollection(queueInteger);

        // Add add element in the back of queue
        queueInteger.add(1000);
        System.out.println(queueInteger.peek());
        printCollection(queueInteger);
    }

    static void printCollection(Collection<?> input) {
        Iterator<?> iterator = input.iterator();
        count++;
        System.out.println("Start-----" + count);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("End-------"  + count);
    }
}
