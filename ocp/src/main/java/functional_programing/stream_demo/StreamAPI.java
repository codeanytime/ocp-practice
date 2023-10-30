package functional_programing.stream_demo;

import generic_and_collections.model.Dog;

import java.util.*;
import java.util.stream.*;

/**
 * @author thanhch
 * <p>
 * Date: 31/10/2023
 * <p>
 * Class: StreamAPI
 */
public class StreamAPI {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
        Set<Double> doubleSet = Stream.generate(() -> Math.random()).limit(1000000).skip(1000000 - 5).collect(Collectors.toSet());
        List<Integer> integerList = stream.limit(1000000).skip(1000000 - 5).collect(Collectors.toList());
        System.out.println(integerList);
        System.out.println(doubleSet);
        boolean test = doubleSet.stream().anyMatch(i -> i < 0.2);
        boolean test1 = doubleSet.stream().noneMatch(i -> i > 0.8);
        System.out.println(test);
        System.out.println(test1);

        List<String> strList = new ArrayList<>(Arrays.asList("hi", "thanhch", "helo", "abc", "cde"));

        String strLengthGreater2 = strList.parallelStream().filter(s -> s.length() >= 2).findAny().orElseGet(null);
        System.out.println(strLengthGreater2);

        Stream<Integer> integerStream = Stream.iterate(1, i -> i + 1).skip(10).limit(100000);
        Integer result = integerStream.filter(i -> i % 2 == 0).findAny().orElseGet(null);
        System.out.println(result);

        IntStream testIntStream1 = IntStream.iterate(1, n -> n + 1).limit(5);
        testIntStream1.forEach(System.out::println);

        IntStream testIntStream2 = IntStream.rangeClosed(1, 10);
        testIntStream2.forEach(System.out::println);

        Stream<Dog> dogStream = IntStream.rangeClosed(1, 5).mapToObj(i -> new Dog(i, "dog" + i));
        List<Dog> dogList = dogStream.collect(Collectors.toList());

        dogList.stream().filter(d -> d.getId() % 2 == 0).findFirst().ifPresent(d -> {
            d.setName("Mickey");
        });

        dogList.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.generate(() -> Math.random()).limit(10);
        doubleStream.average().ifPresent(System.out::println);

        IntStream intStream1 = IntStream.rangeClosed(1, 100);
        intStream1.average().ifPresent(System.out::println);

        IntStream intStream2 = IntStream.rangeClosed(1, 10);
        List<Integer> intList = intStream2.boxed().collect(Collectors.toList());
        intList.add(10);
        List<Integer> notOddNumList = intList.stream().distinct().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(notOddNumList);

        LongStream logStream = LongStream.of(1, 2, 3, 4);
        logStream.boxed().forEach(i -> System.out.println(i.getClass()));
    }
}
