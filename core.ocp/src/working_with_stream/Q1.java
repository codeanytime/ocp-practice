package working_with_stream;

import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 29/11/2023
 * <p>
 * Class: Q1
 */
public class Q1 {
    public static void main(String[] args) {
        Stream<StringBuilder> stream = Stream.of();
        stream.map(t -> t.reverse())
                .forEach(System.out::println);

        // Compile error because generic.
//        Stream.of().map(t -> t.reverse()).forEach(System.out::println);
    }
}
