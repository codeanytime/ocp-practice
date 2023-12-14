package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 14/12/2023
 * <p>
 * Class: Q25
 */
public class Q25 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        // If add (index, e) -> must be continuous index, if not exception occur
        list.add(0, "hello");
//        list.add(1, "abc");
        list.add(2, "hi");
    }
}
