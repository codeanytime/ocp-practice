package working_with_stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 30/11/2023
 * <p>
 * Class: Q13
 */
public class Q13 {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("Ocp");
        str.flatMapToInt(s -> s.chars()).forEach(System.out::println);

        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("dabb");
        StringBuilder s3 = new StringBuilder("contact");
        StringBuilder s4 = new StringBuilder("be");
        List<StringBuilder> inputList = List.of(s1, s2, s3, s4);
        long count = inputList.stream().map(StringBuilder::reverse).filter(s -> s.length() >= 4).count();
        System.out.println("COUNT " + count);
        System.out.println(inputList);

//        List<Integer> test = List.of(1, 2, null);
//        System.out.println(test);

        Set<Integer> set = Set.of(1,2,5,4);
        System.out.println(set);

        Map<Integer, String> map = Map.of(1, "thanhch", 2, "nguyetnm");
        System.out.println(map);
    }
}
