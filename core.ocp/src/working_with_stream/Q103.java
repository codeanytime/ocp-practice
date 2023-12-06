package working_with_stream;

import java.util.stream.IntStream;

/**
 * @author thanhch
 * <p>
 * Date: 05/12/2023
 * <p>
 * Class: Q103
 */
public class Q103 {
    public static void main(String[] args) {
        int res = IntStream.rangeClosed(1, 1000)
                .filter(i -> i > 50)
                .findFirst().getAsInt();
        System.out.println(res);
    }
}
