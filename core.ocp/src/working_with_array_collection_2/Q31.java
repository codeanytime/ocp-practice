package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 15/12/2023
 * <p>
 * Class: Q31
 */
public class Q31 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.set(0, null);
        System.out.println(list);
    }
}
