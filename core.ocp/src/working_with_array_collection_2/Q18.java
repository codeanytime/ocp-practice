package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 13/12/2023
 * <p>
 * Class: Q18
 */
public class Q18 {
    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<StringBuilder>();
        StringBuilder sb = new StringBuilder("Hello");
        list.add(sb);
        list.add(new StringBuilder("Hello"));
        list.add(sb);
        sb.append(" World");
        System.out.println(list);
    }
}
