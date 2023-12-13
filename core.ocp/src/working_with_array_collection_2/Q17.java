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
 * Class: Q17
 */
public class Q17 {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>(Arrays.asList("T","S","R","I","F"));
        ListIterator<String> iter = test.listIterator();

        while (iter.hasNext()) {
            // Should not call remove before next in Iterator, ListIterator -> IllegalStateException
            iter.next();
            iter.remove();
        }
        System.out.println(test.size());
    }
}
