package working_with_stream;

import java.util.Optional;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q24
 */
public class Q24 {
    public static void main(String[] args) {
        Optional<Integer> opt = Optional.ofNullable(null);
//        System.out.println(opt.orElseThrow(() -> new RuntimeException("no value here")));
        System.out.println(opt.orElse(-1));
    }
}
