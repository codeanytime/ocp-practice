package working_with_stream;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q47
 */
public class Q47 {
    public static void main(String[] args) {
        var list = List.of("MANGO", "BANANA", "ORANGE", "PEARS", "GRAPES");
        Predicate<String> predicate = str -> {
            int ctr = 1;
            boolean result = str.indexOf("N") != -1;
            System.out.println(ctr++ + ".");
            return result;
        };

        list.stream().filter(predicate).mapToInt(s -> s.length()).summaryStatistics();
    }
}
