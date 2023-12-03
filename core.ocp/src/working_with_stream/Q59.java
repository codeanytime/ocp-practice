package working_with_stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q59
 */
public class Q59 {
    public static void main(String[] args) {
        var temp = "*";
        for (int i = 0; i < 5; i++) {
            System.out.println(temp.repeat(i));
        }

        Stream.iterate("*", s -> s += "*").limit(5).forEach(System.out::println);
        Stream.iterate("*", s -> s.length() <= 5, s -> s += "*").forEach(System.out::println);
        IntStream.rangeClosed(1, 5).mapToObj(i -> "*".repeat(i)).forEach(System.out::println);
        var s = "hello my name is thanh";
        System.out.println(s.substring(0, s.indexOf("o") + 1));
    }
}
