package working_with_stream;

import java.util.List;
import java.util.function.Function;

/**
 * @author thanhch
 * <p>
 * Date: 05/12/2023
 * <p>
 * Class: Q102
 */
public class Q102 {
    public static void main(String[] args) {
        var list = List.of("S", "P", "I", "R", "I", "T");
        list.stream().forEach(System.out::print);
        list.parallelStream().forEachOrdered(System.out::print);
        list.stream().map(Function.identity()).forEach(System.out::print);
    }
}
