package working_with_array_collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 13/12/2023
 * <p>
 * Class: Q74
 */
public class Q74 {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("hi");
        test.add("hello");

        List<? super String> test1 = new ArrayList<>();
        test1.add("hi");
//        test1.remove(0);
        System.out.println(test1.get(0));

        List<? extends Object> test2 = new ArrayList<>();
//        test2.add("hello");
    }
}
