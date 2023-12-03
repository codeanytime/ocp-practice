package working_with_stream;

import java.util.stream.IntStream;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q53
 */
public class Q53 {
    public static void main(String[] args) {
        String str = "North East West South";
        str.chars().forEach(System.out::println);

        // range(start, end): start inclusive, end exclusive. ->> print 1 ->> 4.
        IntStream.range(1, 5).forEach(System.out::print);
        System.out.println();
        // rangeClosed(start, end): start end inclusive ->> print 1 -> 5;
        IntStream.rangeClosed(1, 5).forEach(System.out::print);
        // Nothing print. range increase. end > start.
        IntStream.range(40, 5).forEach(System.out::println);
        IntStream.range(5, 5).forEach(System.out::println);
    }
}
