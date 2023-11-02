package functional_programing.review;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 03/11/2023
 * <p>
 * Class: FixReview
 */
public class FixReview {
    public static void main(String[] args) {

        // 1 - 6
        Predicate<String> predicate = s -> s.contains("h");
        Stream<String> stream1 = Stream.generate(() -> " " + "hello");
        Stream<String> stream2 = Stream.generate(() -> " iabc");
//        System.out.println(stream1.allMatch(predicate)); ---> infinite
//        System.out.println(stream2.noneMatch(predicate)); ---> infinite
        System.out.println(stream1.anyMatch(predicate)); //---> finite
//        System.out.println(stream2.anyMatch(predicate)); ---> infinite

//        System.out.println(stream1.noneMatch(predicate)); // ---> exception stream has already use before.
        System.out.println(stream2.allMatch(predicate));

        // Question 7
        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(87);
        integerList.add(123);
        integerList.add(56);
        integerList.add(80);

        integerList.stream().filter(x -> x % 2 == 0).peek(System.out::println).collect(Collectors.toList());

        List<Integer> sortList = integerList.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.println(sortList);

//        Stream.generate(() -> "1")
//                .filter(s -> s.length() < 1)
//                .limit(10)
//                .collect(Collectors.toList()); --> unlimited because no element length < 1.

        // Question 11
        String out = Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining());
        System.out.println(out); // out 12345
        String out2 = Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining(""));
        System.out.println(out2); // out 11111

        IntStream intStream = IntStream.of(1, 2, 3, 4);
//        System.out.println(intStream.min());
//        System.out.println(intStream.max());
//        System.out.println(intStream.sum());
        System.out.println(intStream.average().getAsDouble());

        Stream<Integer> intStream2 = IntStream.generate(() -> 2).boxed();
        List<Integer> result = intStream2.limit(10).filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(result);

        // Flatmap
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1, 2, 10));
        input.add(Arrays.asList(5, 99, 100));
        input.add(Arrays.asList(7, 9, 13, 13));

        List<Integer> finalResult = input.stream().flatMap(x -> x.stream().filter(i -> i % 2 == 0)).collect(Collectors.toList());
        System.out.println(finalResult);
        List<Integer> test3 = input.stream().flatMap(x -> x.stream().filter(i -> i % 2 != 0)).collect(Collectors.toList());
        System.out.println(test3);

        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList(10, 100, 101, 3);
        Stream.of(l1, l2, l3).flatMap(x -> x.stream()).map(x -> x + 1).forEach(System.out::println);

        Map<Boolean, List<Integer>> resultMap = input.stream().flatMap(x -> x.stream()).collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(resultMap);
        Map<Boolean, List<Integer>> resultMap2 = input.stream().flatMap(x -> x.stream())
                .collect(Collectors.groupingBy(i -> i % 2 == 0));
        System.out.println(resultMap2);
        Map<Integer, Set<Integer>> resultMap3 = input.stream().flatMap(x -> x.stream()).collect(Collectors.toList())
                .stream().collect(Collectors.groupingBy(i -> i % 2, Collectors.toSet()));
        System.out.println(resultMap3);
    }
}
