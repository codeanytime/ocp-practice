package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 16/12/2023
 * <p>
 * Class: Q67
 */
public class Q67 {
    public static void main(String[] args) {
        List<String> list = List.of("A","B","C");
        List<String> cloneList = List.copyOf(list);
        System.out.println((list == cloneList) + " " + list.equals(cloneList));

    }
}
