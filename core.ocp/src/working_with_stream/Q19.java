package working_with_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q19
 */
public class Q19 {
    // allMatch, anyMatch return true if empty and predicate is not evaluated.
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.stream().anyMatch(s -> s.length() > 0));
        System.out.println(list.stream().allMatch(s -> s.length() > 0));
        System.out.println(list.stream().noneMatch(s -> s.length() > 0));

        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("hi");
        list1.add("abc");

        Predicate<String> p = s -> {
            System.out.println("filter ");
            return s.length() > 5;
        };
//        System.out.println(list1.stream().anyMatch(p));
//        System.out.println(list1.stream().allMatch(p));
        System.out.println(list1.stream().noneMatch(p));
    }
}
