package working_with_stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: Q115
 */
public class Q115 {
    /**
     * Collectors.groupingByConcurrent(...) returns a concurrent and unordered Collector whereas,
     * * Collectors.groupingBy(...) returns a non-concurrent and ordered (based on encounter order) Collector.*
     * @param args
     */
    public static void main(String[] args) {
        var stream = Stream.of("SON", "WIFE", "MOTHER", "FATHER", "UNCLE", "DAUGHTER");
        var map = stream.parallel()
                .collect(Collectors.groupingByConcurrent(s -> s.length() > 4));
        System.out.println(map);
        System.out.println(map.get(false).size());

        var stream2 = Stream.of("SON", "WIFE", "MOTHER", "FATHER", "UNCLE", "DAUGHTER");
        var map2 = stream2.parallel().collect(Collectors.groupingBy(s -> s.length() > 4));
        System.out.println(map2);
    }
}
