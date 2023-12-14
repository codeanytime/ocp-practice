package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 15/12/2023
 * <p>
 * Class: Q37
 */
public class Q37 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(100);
        list.remove(Integer.valueOf("100"));
        System.out.println(list);
//        list.remove(100); --> Exception index out of bound.
    }
}
