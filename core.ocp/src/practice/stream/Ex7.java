package practice.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 31/05/2024
 * <p>
 * Class: Ex7
 */
public class Ex7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 3, 4, 6, 7);
        IntSummaryStatistics statistics = numbers.stream().mapToInt(item -> item).summaryStatistics();
        System.out.println(statistics.getMin());
        System.out.println(statistics.getMax());
    }
}
