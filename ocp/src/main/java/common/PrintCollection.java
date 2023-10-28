package common;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author thanhch
 * <p>
 * Date: 28/10/2023
 * <p>
 * Class: PrintCollection
 */
public class PrintCollection {
    static int count = 0;
    public static void printAllElement(Collection input) {
        count++;
        System.out.println("START -----" + count);
        Iterator iterator = input.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("END -------" + count);
    }
}
