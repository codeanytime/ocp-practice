package practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 30/05/2024
 * <p>
 * Class: Ex1
 */
public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        Double average = numbers.stream().collect(Collectors.averagingDouble(item -> item));
        System.out.println(average);

        Double average2 = numbers.stream().mapToDouble(Integer::doubleValue).average()
                        .orElse(0.0);
        System.out.println(average2);
    }
}
