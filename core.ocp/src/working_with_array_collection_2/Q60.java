package working_with_array_collection_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author thanhch
 * <p>
 * Date: 16/12/2023
 * <p>
 * Class: Q60
 */
public class Q60 {
    public static void main(String[] args) {
        // Compile success. size = 1 because unique in HashSet
        Set<String> set = new HashSet<>(Arrays.asList(null, null, null));
        System.out.println(set.size());

        // NPE List.of required non null
//        Set<String> set2 = new HashSet<>(List.of(null, null, null));
//        System.out.println(set2.size());
    }
}
