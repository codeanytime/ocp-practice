package working_with_array_collection_2;

import java.util.Set;

/**
 * @author thanhch
 * <p>
 * Date: 16/12/2023
 * <p>
 * Class: Q62
 */
public class Q62 {
    public static void main(String[] args) {
//        Set<String> set = Set.of("A", "A"); --> Exception because duplicate
//        Set<String> set2 = Set.of("A", null); //--> NPE
        Set<String> set1 = Set.of("A", "B", "C");
        Set<String> set2 = Set.of("C", "B", "A");
        System.out.println(set1.equals(set2));
        System.out.println(set1);
        System.out.println(set2);
    }
}
