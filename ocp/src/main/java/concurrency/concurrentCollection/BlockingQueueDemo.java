package concurrency.concurrentCollection;

import java.util.Queue;
import java.util.concurrent.*;

/**
 * @author thanhch
 * <p>
 * Date: 08/10/2023
 * <p>
 * Class: BlockingQueue
 */
public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("hello");
        queue.add("world");
        queue.add("my name is");
        queue.add("thanh");
        System.out.println(queue);
        for (String s: queue) {
            System.out.println(queue.poll());
        }
        // Output []
        System.out.println("After " + queue);

        BlockingQueue<Integer> queue2 = new PriorityBlockingQueue<>();
        for (int i = 10; i > 0; i--) {
//            if (i % 2 == 0) {
//                TimeUnit.SECONDS.sleep(2);
//            }
            queue2.offer(i, 1, TimeUnit.SECONDS);
        }
        System.out.println(queue2.poll());
        System.out.println(queue2);
    }
}
