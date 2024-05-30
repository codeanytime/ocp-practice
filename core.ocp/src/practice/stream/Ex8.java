package practice.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 31/05/2024
 * <p>
 * Class: Ex8
 */
public class Ex8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 1, 3, 8, -1);
        Integer secondSmallest = numbers.stream().sorted().skip(1).findFirst().orElse(null);
        Integer secondBigest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(secondSmallest);
        System.out.println(secondBigest);
    }
}
