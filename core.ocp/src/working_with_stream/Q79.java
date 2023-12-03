package working_with_stream;

import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q79
 */
public class Q79 {
    public static void main(String[] args) {
        Stream<Double> test = Stream.of(1.8, 2.2, 3.5);
        double sum = test.reduce(0.0, Double::sum);
        System.out.println(sum);
        print(0d);
    }

    static void print(Double d) {
        System.out.println(d);

    }
}
