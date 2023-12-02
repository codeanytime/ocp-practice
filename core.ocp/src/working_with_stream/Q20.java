package working_with_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q20
 */
public class Q20 {
    public static void main(String[] args) {
        // Note: ref must be final. If change ref -> compile error in lambda.
        int ref = 10;
        List<Integer> list = new ArrayList<>();
        boolean test = list.stream().anyMatch(i -> {
                System.out.println("Hello");
                return i > ref;
        });
        System.out.println(test);

        Optional<Integer> opt = Optional.ofNullable(null);
        System.out.println(opt.orElse(-1));
    }
}
