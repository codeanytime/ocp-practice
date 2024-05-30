package practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 30/05/2024
 * <p>
 * Class: Ex2
 */
public class Ex2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hi", "how", "are", "you");
        List<String> stringUpperList = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(stringUpperList);
    }
}
