package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 13/12/2023
 * <p>
 * Class: Q20
 */
public class Q20 {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("Hello");
        test.add("World");
//        if (test.remove(0)) {
//
//        }
        // remove(index i) -> Object to remove
        // remove(Object o) -> return boolean
        if (test.remove("Hello")) {
            test.remove("World");
        }
        System.out.println(test);
    }
}
