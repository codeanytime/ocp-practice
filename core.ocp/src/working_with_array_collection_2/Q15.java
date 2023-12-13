package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author thanhch
 * <p>
 * Date: 13/12/2023
 * <p>
 * Class: Q15
 */
public class Q15 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A","B","C","A1"));
        ListIterator iterator = list.listIterator(3);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
