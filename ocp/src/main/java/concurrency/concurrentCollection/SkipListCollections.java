package concurrency.concurrentCollection;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author thanhch
 * <p>
 * Date: 08/10/2023
 * <p>
 * Class: SkipListCollections
 */
public class SkipListCollections {
    public static void main(String[] args) throws Exception {
        SortedSet<String> set = new ConcurrentSkipListSet();
        set.add("B");
        set.add("A");
        set.add("C");
        set.add("D");
        set.add("D");
//        set.add(null); => Not contain null.
        System.out.println(set);

        SortedMap<Integer, String> map = new ConcurrentSkipListMap<Integer, String>();
        map.put(99, "Cat Huy Thanh");
        map.put(22, "nguyen minh nguyet");
        map.put(100, "nguyen duc nghia");
        System.out.println(map);
    }
}
