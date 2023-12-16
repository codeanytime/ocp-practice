package working_with_array_collection_2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author thanhch
 * <p>
 * Date: 16/12/2023
 * <p>
 * Class: Q59
 */
public class Q59 {
    public static void main(String[] args) {
        // NPE
        Set<String> set = new TreeSet<>(Arrays.asList("A", null));
    }
}
