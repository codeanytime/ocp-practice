package concurrency.concurrentCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        BlockingQueue<String> queue3 = new PriorityBlockingQueue<>();
        queue3.offer("B");
        queue3.offer("A");
        queue3.offer("C");
        System.out.println(queue3);
        System.out.println("Priority" + Thread.currentThread().getPriority());
        Stream<String> s = new ArrayList<>(Arrays.asList("hello")).stream().parallel();
        System.out.println(s.collect(Collectors.toList()));

        BlockingDeque<Integer> queue4 = new LinkedBlockingDeque<>();
        queue4.offer(2);
        System.out.println("QUEUE 4 " + queue4);
        queue4.offerFirst(1, 1, TimeUnit.SECONDS);
        queue4.offerLast(1, 1, TimeUnit.SECONDS);
        System.out.println("QUEUE 4 " + queue4);
    }
}
