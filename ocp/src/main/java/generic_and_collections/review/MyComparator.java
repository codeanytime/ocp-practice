package generic_and_collections.review;

import java.util.Comparator;

/**
 * @author thanhch
 * <p>
 * Date: 29/10/2023
 * <p>
 * Class: MyComparator
 */
public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.toLowerCase().compareTo(o1.toLowerCase());
    }
}
