package concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author thanhch
 * <p>
 * Date: 21/04/2024
 * <p>
 * Class: CopyOnWrite
 */
public class CopyOnWrite {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(100, 1, 99));
        for (Integer i : list) {
            list.add(9);
        }
        System.out.println(list.size());
    }
}
