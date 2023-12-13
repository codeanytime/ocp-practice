package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 13/12/2023
 * <p>
 * Class: Q12
 */
public class Q12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hi");
        list.add("Abc");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String s = iterator.next();
            if (s.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
