package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 13/12/2023
 * <p>
 * Class: Q19
 */
public class Q19 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = new String("Hello");
        list.add(s);
        list.add("Hello");
        list.add(s);
        s.replaceAll("l", "L");
        System.out.println(list);
    }
}
