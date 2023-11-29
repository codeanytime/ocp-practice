package working_with_stream;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author thanhch
 * <p>
 * Date: 29/11/2023
 * <p>
 * Class: Q5
 */
public class Q5 {
    public static void main(String[] args) {
        List<Integer> input = List.of(100, -200, 10, -15);
        Predicate<Integer> p = n -> {
            int count = 1;
            boolean result = n > 0;
            System.out.print(count++ + ".");
            return result;
        };
        input.stream().filter(p).count();
    }
}
