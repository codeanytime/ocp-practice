package working_with_stream;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author thanhch
 * <p>
 * Date: 06/12/2023
 * <p>
 * Class: Q108
 */
public class Q108 {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        IntStream stream = IntStream.rangeClosed(1, 7);
        stream.parallel().map(i -> {
            list.add(i);
            return i;
        }).forEach(System.out::print);

        System.out.println();

        list.parallelStream().forEach(System.out::print);

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            integerList.add(i);
        }
        Optional<Integer> result = integerList.parallelStream().filter(i -> i > 50).findFirst();
        System.out.println("RESULT " + result);
    }
}
