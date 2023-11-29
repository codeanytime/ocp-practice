package working_with_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 29/11/2023
 * <p>
 * Class: Q7
 */
public class Q7 {
    public static void main(String[] args) {
        // Terminal operation: sum, count, forEach, toArray, avg, collect....
        List<StringBuilder> listStr = new ArrayList<>();
        listStr.add(new StringBuilder("hello"));
        listStr.add(new StringBuilder("hi"));
        listStr.stream().map(s -> s.reverse()).toArray();
        System.out.println(listStr);
    }
}
