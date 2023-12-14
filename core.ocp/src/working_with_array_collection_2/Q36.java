package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 15/12/2023
 * <p>
 * Class: Q36
 */
public class Q36 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(27);
        list.add(27);
        list.add(227);
        list.add(227);
        System.out.println(list.get(0) == list.get(1));
        System.out.println(list.get(2) == list.get(3));
    }
}
