package working_with_array_collection_2;

import java.util.ArrayList;

/**
 * @author thanhch
 * <p>
 * Date: 16/12/2023
 * <p>
 * Class: Q42
 */
public class Q42 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("TAKE");
        list.add("THE");
        list.add("RISK");
        System.out.println(String.join("-", list));

        // Error because list of object
//        var list = new ArrayList<>();
//        list.add("TAKE");
//        list.add("THE");
//        list.add("RISK");
//        String.join("-", list);
    }
}
