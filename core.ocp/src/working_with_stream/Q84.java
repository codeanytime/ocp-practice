package working_with_stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 04/12/2023
 * <p>
 * Class: Q84
 */
public class Q84 {
    public static void main(String[] args) {
        Stream.of(2, 4, 6, 8, 10, 12)
                .filter(Predicate.not(Predicate.isEqual(100)))
                .reduce((i1, i2) -> i1 + i2)
                .stream()
                .forEach(System.out::println);

        Predicate<Integer> p = s -> s % 2 == 0;

        Stream.of(1, 2, 4, 5, 10).filter(p.negate()).forEach(System.out::println);
    }
}
