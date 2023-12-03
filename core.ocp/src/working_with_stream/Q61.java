package working_with_stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q61
 */
public class Q61 {
    // ofNullable, or, filter, map, faltMap methods are not available in primitive type
    public static void main(String[] args) {
        IntStream stream = IntStream.generate(() -> new Random().nextInt(10)).limit(10);
        System.out.println(stream.findFirst().getAsInt());

        Stream<Integer> streamInt = Stream.of(1, 4, 3, 10);
        Optional.of(null);
        Optional.ofNullable(null);
        OptionalInt.of(1);
    }
}
