package functional_programing.review;

import java.util.*;
import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
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

        var list2 = List.of(new Rope(5, "red"),
                new Rope(10, "Red"), new Rope(7, "RED"),
                new Rope(10, "green"), new Rope(7, "Blue"));

        list2.stream().filter(new Rope.RedRopeFilter()::filter).forEach(System.out::println);
        var rope = Rope.RedRopeFilter.filter2();

        var list3 = new ArrayList<String>();
        System.out.println(list3.stream().allMatch(s -> s.length() > 0));
        System.out.println(list3.stream().anyMatch(s -> s.length() > 0));
        System.out.println(list3.stream().noneMatch(s -> s.length() > 0));

        int ref = 10;
        var list4 = new ArrayList<Integer>(Arrays.asList(11, 21, 31));

        // Any match return true if empty
        list4.stream().anyMatch(s -> {
            System.out.println("ANY MATCH");
            return s > ref;
        });

        list4.stream().allMatch(s -> {
            System.out.println("ALL MATCH");
            return s > ref;
        });

        // return true if empty
        list4.stream().noneMatch(i -> {
            System.out.println("NONE MATCH");
            return i > ref;
        });
        Optional<Integer> opt = Optional.empty();
        System.out.println(opt.orElseGet(() -> -1));

        var input = List.of(-1, 10, 100, 10);
        Predicate<Integer> predicate = (i) -> {
            System.out.print("1" + ".");
            return i > 0;
        };
        input.stream().filter(i -> predicate.test(i)).findFirst();

        Stream<Double> doubleStream = Stream.of(2d, 3d, 1d);
        doubleStream.sorted().findFirst();

        List<Integer> oddList = new ArrayList<>(List.of(3, 5, 1, 9));
        oddList.stream().sorted().findFirst().get();
//        Collections.sort(oddList);
//        System.out.println(oddList);
        System.out.println(oddList.stream().distinct().findFirst().get());
        Stream<String> stream = Stream.of("a", "as", "an", "and").unordered();
        Optional<String> first = stream.findFirst();
        if(first.isPresent()) {
            System.out.println(first.get());
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1h");
        map.put(2, "1h");
        map.put(3, "1h");

        long seed = 10;
        var stream1 = Stream.iterate(seed, i -> i <= 12, i -> i + 2); //Line n1
        LongFunction<LongUnaryOperator> func = m -> n -> n / m; //Line n2
        LongUnaryOperator operator = i -> i;
        LongFunction<Long> longFunc = j -> j;

        stream1.mapToLong(i -> i).map(func.apply(2)).forEach(System.out::println); //L

        Map<Integer, String> mapTest = new HashMap<>();
        mapTest.put(1, "hi");
        mapTest.putIfAbsent(1, "hello");
        System.out.println("MAP TEST " + mapTest);
    }
}
