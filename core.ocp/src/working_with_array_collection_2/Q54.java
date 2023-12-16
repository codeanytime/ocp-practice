package working_with_array_collection_2;

import java.util.Arrays;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 16/12/2023
 * <p>
 * Class: Q54
 */
public class Q54 {
    public static void main(String[] args) {
        var list1 = List.of("A", "B", "D");
        var list2 = Arrays.asList("A", "B", "C");
        list2.set(2, "D");
//        list1.set(2, "C"); --> UnsupportedOperation. List.of not set, add, retainAll, remove.
        System.out.println(list2);
//        list1.retainAll(list2);
        list2.retainAll(list1);
        System.out.println(list2);
    }
}
