package working_with_stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author thanhch
 * <p>
 * Date: 29/11/2023
 * <p>
 * Class: Q8
 */
public class Q8 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("hi", 1);
        map.put("hello", 2);
        // No stream method on map because map is not collection.
//        map.stream().count();
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<String> setKey = map.keySet();
        for (String i: setKey) {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<String, Integer>> setValue = map.entrySet();
        for (Map.Entry s : setValue) {
            System.out.println(s);
        }
    }
}
