package working_with_stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q76
 */
public class Q76 {
    public static void main(String[] args) {
        var text = "I am going to pass OCP exam in first attempt";
        Stream<String> stream = Arrays.stream(text.split(" "));
        var stat = stream.mapToInt(String::length).summaryStatistics();
        System.out.println(stat.getMin());
        System.out.println(stat.getMax());
    }
}
