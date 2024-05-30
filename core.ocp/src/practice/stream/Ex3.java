package practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 30/05/2024
 * <p>
 * Class: Ex3
 */
public class Ex3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 8, 10, 11, 1);
        Map<String, Integer> result = numbers.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.summingInt(Integer::intValue)))
                .entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey() ? "even" : "odd", Map.Entry::getValue));

        System.out.println(result);
        System.out.println("Sum of odd: " + result.get("odd"));
        System.out.println("Sum of even: " + result.get("even"));
    }
}
