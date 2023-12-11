package working_with_array_collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 12/12/2023
 * <p>
 * Class: Q69
 */
public class Q69 {
    public static void main(String[] args) {
        List<? super String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
//        for (String s: list) {
//            System.out.println(s);
//        }
        for (Object o: list) {
            System.out.println(o);
        }
    }
}
