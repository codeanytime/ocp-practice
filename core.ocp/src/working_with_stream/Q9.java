package working_with_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 30/11/2023
 * <p>
 * Class: Q9
 */
public class Q9 {
    public static void main(String[] args) {
        List<String> test = Arrays.asList("A", "D", "B", "C");
        Collections.sort(test, null);
        System.out.println(test);
    }
}
