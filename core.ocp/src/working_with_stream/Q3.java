package working_with_stream;

import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 29/11/2023
 * <p>
 * Class: Q3
 */
public class Q3 {
    public static void main(String[] args) {
        Stream.of(true, false, true)
                .map(t -> t.toString().toUpperCase())
                .peek(System.out::println)
                .filter(t -> t.equals("true"))
                .count();
    }
}
