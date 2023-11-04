package functional_programing.review;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 04/11/2023
 * <p>
 * Class: UdemyExercise
 */
public class UdemyExercise {
    public static void main(String[] args) {
        Stream.of(true, false, true).map(s -> s.toString().toUpperCase()).peek(System.out::println).collect(Collectors.toList());
        int ctr = 0;
        System.out.println(++ctr);

        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("abc"));
        list.add(new StringBuilder("thanhch"));

        list.stream().map(x -> x.reverse()).filter(s -> s.length() > 2).collect(Collectors.toList());
        System.out.println(list);
        var name = "thanhch";
        System.out.println(name.chars());
    }
}
