package working_with_stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q48
 */
public class Q48 {
    public static void main(String[] args) {
        var stream = Stream.of("d", "a", "mm", "bb", "zzz", "www");
        Comparator<String> comp = Comparator.comparingInt(String::length);
        stream.sorted(comp.thenComparing(String::compareTo)).map(s -> s + " ").forEach(System.out::print);
    }
}
