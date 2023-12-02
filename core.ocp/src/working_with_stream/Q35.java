package working_with_stream;

import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q35
 */
public class Q35 {
    public static void main(String[] args) {
        var stream = Stream.of("hi", "Java", "hello", new String("Java"));
        stream.distinct().findAny().stream().forEach(System.out::println);

        var result = Stream.of(10, 0, -10).sorted().findAny().get();
        System.out.println(result);

        var findResultFirst = Stream.of(10, 0, -10, 1, 2, 4).unordered().parallel().findFirst().get();
        System.out.println(findResultFirst);
    }
}
