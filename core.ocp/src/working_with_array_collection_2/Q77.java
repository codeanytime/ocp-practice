package working_with_array_collection_2;

import java.util.Map;

/**
 * @author thanhch
 * <p>
 * Date: 17/12/2023
 * <p>
 * Class: Q77
 */
public class Q77 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = Map.of(1, "A", 2, "B");
        Map<Integer, String> map2 = Map.of(2, "B", 1, "A");
        System.out.println(map1.equals(map2));
        var res1 = map1.entrySet();
        var res2 = map2.entrySet();
        for (Map.Entry<Integer, String> entry: map1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
