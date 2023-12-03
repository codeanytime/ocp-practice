package working_with_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 04/12/2023
 * <p>
 * Class: Q99
 */
public class Q99 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Stream.iterate(1, i -> i <= 10, i -> ++i).collect(Collectors.toList());
        List<Integer> output = list.parallelStream().filter(s -> {
            final Integer i = s;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return i % 2 == 0;
        }).collect(Collectors.toList());
        System.out.println(output);
    }
}
