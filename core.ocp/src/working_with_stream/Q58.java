package working_with_stream;

import java.util.stream.IntStream;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q58
 */
public class Q58 {
    public static void main(String[] args) {
        IntStream stream = "OCP".chars();
        stream.forEach(c -> System.out.println((char) c));
        // Exception because stream has used.
//        System.out.println(stream.count());
    }
}
