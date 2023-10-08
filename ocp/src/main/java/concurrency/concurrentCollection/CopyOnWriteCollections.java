package concurrency.concurrentCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author thanhch
 * <p>
 * Date: 08/10/2023
 * <p>
 * Class: CopyOnWriteCollections
 */
public class CopyOnWriteCollections {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (String s : list) {
            list.add(s);
        }
        System.out.println(list);
        // Output: [a, b, c, a, b, c]

        Set<String> uniques = new CopyOnWriteArraySet<>();
        uniques.add("b");
        uniques.add("a");
        uniques.add("c");
        uniques.add("a");
        for (String s : uniques) {
            uniques.add(s);
        }
        System.out.println(uniques);

    }
}
