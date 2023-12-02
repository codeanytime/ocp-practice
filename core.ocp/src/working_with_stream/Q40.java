package working_with_stream;

import java.util.List;
import java.util.Optional;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q40
 */
public class Q40 {
    public static void main(String[] args) {
        Optional<String> optName = Optional.ofNullable(null);
        Optional<String> test = optName.or(() -> Optional.ofNullable(null)).or(() -> Optional.of("hello"));
        System.out.println(test.get());
    }
}
