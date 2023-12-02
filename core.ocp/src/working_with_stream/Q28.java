package working_with_stream;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q28
 */
public class Q28 {
    public static void main(String[] args) {
        var list = List.of(-80, 100, -40, 25, 200);
        Predicate<Integer> p = num -> {
            int ctr = 1;
            var result = num > 0;
            System.out.print(ctr++ + ".");
            return result;
        };

        var result = list.stream().filter(p).findAny();
        System.out.println(result.orElseThrow(() ->new RuntimeException("No value positive")));
    }
}
