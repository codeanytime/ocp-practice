package working_with_array_collection_2;

import java.util.*;

/**
 * @author thanhch
 * <p>
 * Date: 16/12/2023
 * <p>
 * Class: Q61
 */
public class Q61 {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>(Arrays.asList("red", "green", "blue", "gray"));
        System.out.println("SET: " + set);
        System.out.println(set.ceiling("gray"));
        System.out.println(set.floor("gray"));
        System.out.println(set.higher("gray"));
        System.out.println(set.lower("gray"));
    }
}
