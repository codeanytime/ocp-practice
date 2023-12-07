package working_with_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: Q11
 */
public class Q111 {
    public static void main(String[] args) {
        var list = List.of("hello", "my", "name", "is", "thanh");
        var output = list.stream().collect(Collectors.joining(" "));
        System.out.println(output);
        System.out.println(list);

        var str1 = List.of("S", "P", "O", "R", "T").stream()
                .reduce("", String::concat);
        var str2 = List.of("S", "P", "O", "R", "T").parallelStream()
                .reduce("", String::concat);
        System.out.println(str1);
        System.out.println(str2);
    }
}
