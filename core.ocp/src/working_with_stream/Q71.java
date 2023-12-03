package working_with_stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q71
 */
public class Q71 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream.mapToInt(s -> s.intValue()).sum());

        LongStream streamEx = LongStream.empty();
        System.out.println(streamEx.average());

        IntStream streamIntEx = IntStream.rangeClosed(1, 20).filter(i -> i % 2 ==0);
        var result = streamIntEx.summaryStatistics();
        System.out.println(result.getMin());
        System.out.println(result.getMax());
        System.out.println(result.getAverage());
        System.out.println(result.getSum());
    }
}
