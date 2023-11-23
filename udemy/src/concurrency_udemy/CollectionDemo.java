package concurrency_udemy;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author thanhch
 * <p>
 * Date: 21/11/2023
 * <p>
 * Class: CollectionDemo
 */
public class CollectionDemo {
    public static void main(String[] args) {
        var list1 = List.of("Melon", "Apple", "Banana", "Mango");
        var list2 = new CopyOnWriteArrayList<>(list1);
        for (String s: list2) {
            if (s.startsWith("M")) {
                list2.remove(s);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}
