package working_with_stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q29
 */
public class Q29 {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.generate(() ->Double.valueOf("1.0")).limit(10);
        stream.sorted().findFirst();
        Stream<Number> stream1 = Stream.of();
        Optional opt = stream1.sorted().findFirst();
        System.out.println(opt.orElse(-1));
    }
}
