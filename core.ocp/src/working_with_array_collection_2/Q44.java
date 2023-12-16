package working_with_array_collection_2;

import java.util.ArrayList;

/**
 * @author thanhch
 * <p>
 * Date: 16/12/2023
 * <p>
 * Class: Q44
 */
public class Q44 {
    public static void main(String[] args) {
        var list = new ArrayList<>();
        list.add(1);
        list.add("2");
        list.forEach(System.out::print);
    }
}
