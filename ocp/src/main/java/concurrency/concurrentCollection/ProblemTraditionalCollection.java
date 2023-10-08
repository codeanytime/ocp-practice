package concurrency.concurrentCollection;

import java.util.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author thanhch
 * <p>
 * Date: 08/10/2023
 * <p>
 * Class: ProblemTraditionalCollection
 */
public class ProblemTraditionalCollection {
    public static void main(String[] args) {
        //Throw ConcurrentModificationException
        Map<String, String> map = new HashMap<>();
        map.put("hello", "1");
        map.put("hi", "2");
        System.out.println("Before " + map);
        for (String key : map.keySet()) {
            map.remove(key);
        }
        System.out.println("After: " + map);
    }
}
