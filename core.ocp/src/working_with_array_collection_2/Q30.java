package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 15/12/2023
 * <p>
 * Class: Q30
 */
public class Q30 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(null);
//        list.remove(Integer.valueOf("1")); --> remove(Object)
        System.out.println(list);
        list.remove(null);
//        list.remove(-1); --> exception IndexOutOfBound

        List<String> listNotAllowNull = Collections.checkedList(list, String.class);
        System.out.println(listNotAllowNull);

//        List<String> nonNullList = List.of("A", "B", null); --> NPE because List.of not allow null
    }
}
