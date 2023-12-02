package working_with_stream;

import java.util.Optional;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q43
 */
public class Q43 {
    public static void main(String[] args) {
        Optional opt = Optional.empty();
//        System.out.println(opt.get());
        opt.orElse(new RuntimeException());
        System.out.println(opt.orElseGet(() -> "hello"));
        System.out.println(opt.orElseThrow());
        opt.ifPresentOrElse(s -> System.out.println(s), () -> System.out.println("EMPTY"));
    }
}
