package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 13/12/2023
 * <p>
 * Class: Q5
 */
public class Q5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("H", "E", "L", "L", "O"));
//        System.out.println(list.subList(-1, 1)); exception fromIndex < 0
        list.subList(0,list.size()).clear();
        System.out.println(list); // -> []
    }
}
