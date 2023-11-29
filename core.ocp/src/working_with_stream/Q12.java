package working_with_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 30/11/2023
 * <p>
 * Class: Q10
 */
public class Q12 {
    public static void main(String[] args) {
        String[] arr1 = {"thanh", "hoang", "an"};
        String[] arr2 = {"long", "van"};
        String[] arr3 = {};

        Stream<String[]> streamStr = Stream.of(arr1, arr2, arr3);
        streamStr.flatMap(s -> Arrays.stream(s)).sorted().forEach(s -> System.out.print(s + " "));

        List<String> listStr = new ArrayList<>(List.of("thanh", "hoang", "van", "an"));
        listStr.sort(null);
        System.out.println(listStr);

        Set<String> setStr = Set.of("thanh", "hoang", "van", "an");
        List<String> output = setStr.stream().sorted().collect(Collectors.toList());
        System.out.println("OUTPUT: " + output);
    }
}
