package working_with_stream;

import java.util.stream.IntStream;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q78
 */
public class Q78 {
    public static void main(String[] args) {
        var res = 1;
        IntStream stream = IntStream.rangeClosed(1, 4);
        int result = stream.reduce(res++, (i, j) -> i * j);
        System.out.println(result);
    }
}
