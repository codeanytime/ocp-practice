package working_with_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q77
 */
public class Q77 {
    public static void main(String[] args) {
        var res = 1;
        IntStream stream = IntStream.rangeClosed(1, 5);
        var multi = stream.reduce((i, j) -> i * j);
        System.out.println(multi.orElse(0));

        List<String> test = new ArrayList<>();
        test.add("hello");
        test.add("my");
        test.add("name");
        test.add("is");
        test.add("thanh");

        var resultStr = test.stream().reduce((i, j) -> i.concat(" " + j));
        System.out.println(resultStr.orElse(""));
    }
}
