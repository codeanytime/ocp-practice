package working_with_stream;

import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q15
 */
public class Q15 {
    public static void main(String[] args) {
        // Cach 1
        UnaryOperator<Character> operator = x -> (char)((int) x + 1);
        var vowels = List.of('A','E','I','O','U');
        vowels.stream().map(x -> operator.apply(x)).forEach(System.out::println);

        // Cach 2
        Function<Character, Character> func = x -> (char)((int) x + 1);
        vowels.stream().map(x -> func.apply(x)).forEach(System.out::println);
    }
}
