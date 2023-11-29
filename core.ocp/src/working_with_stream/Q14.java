package working_with_stream;

import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q14
 */
public class Q14 {
    public static void main(String[] args) {
        long seed = 10;
        var stream = Stream.iterate(seed, i -> i <= 12, i -> i = i + 2);
        LongFunction<LongUnaryOperator> func = m -> n -> n/m;
        LongFunction<LongUnaryOperator> func1 = m -> {
            LongUnaryOperator unary = n -> n / m;
            return unary;
        };
        stream.mapToLong(m -> m).map(func1.apply(3)).forEach(System.out::println);
//        stream.mapToLong(m -> m).map(func.apply(2)).forEach(System.out::println);
    }
}
