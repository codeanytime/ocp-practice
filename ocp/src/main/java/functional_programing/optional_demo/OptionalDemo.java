package functional_programing.optional_demo;

import java.util.Optional;

/**
 * @author thanhch
 * <p>
 * Date: 30/10/2023
 * <p>
 * Class: OptinalDemo
 */
public class OptionalDemo {
    public static void main(String[] args) throws Exception {
        Optional<String> strOpt = Optional.of("hello");
        String s = "test";
        String s1 = null;
        Optional<String> emptyOpt = Optional.ofNullable(s);
        if (emptyOpt.isPresent()) {
            System.out.println("empty");
        }
        emptyOpt.ifPresent(x -> System.out.println(x));
        String nullOpt2 = Optional.ofNullable(s1).orElseGet(() -> "default");
        System.out.println(nullOpt2);
        String nullOpt = Optional.ofNullable(s1).orElseThrow(() -> new Exception("null value"));
        System.out.println(nullOpt.length());

//        Optional.of(null); // -> NPE. It's different between of & ofNullable.

    }
}
