package functional_programing.stream_demo;

import generic_and_collections.model.Dog;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author thanhch
 * <p>
 * Date: 31/10/2023
 * <p>
 * Class: StreamCollect
 */
public class StreamCollect {
    public static void main(String[] args) {
        // list to map
        List<Dog> dogList = IntStream.rangeClosed(1, 10).mapToObj(d -> new Dog(d, "Dog " + d)).collect(Collectors.toList());
        Map<Integer, Dog> map = dogList.stream().collect
                (Collectors.toMap(Dog::getId, d -> new Dog(d.getId(), d.getName())));
        System.out.println(map);
        Map<Integer, String> dogMap = dogList.stream().collect(Collectors.toMap(Dog::getId, d -> d.getName()));
        System.out.println(dogMap);
        System.out.println(dogMap.getClass());

        // Good practice
        List<Dog> dogListSample = new ArrayList<>();
        dogListSample.add(new Dog(1, "mickey"));
        dogListSample.add(new Dog(2, "Toto"));
        dogListSample.add(new Dog(3, "Moon"));
        dogListSample.add(new Dog(1, "Mic"));
//        dogListSample.add(new Dog(null, "Jerry"));

        Map<Integer, String> dogMapSample = dogListSample.stream()
                .collect(Collectors.toMap(Dog::getId, d -> d.getName(), (d1, d2) -> d1 + "," + d2, TreeMap::new));
        System.out.println(dogMapSample);
        System.out.println(dogMapSample.getClass());

        Map<Integer, List<Dog>> mapLengthAndDog = dogListSample.stream().collect(Collectors.groupingBy(s -> s.getName().length()));
        System.out.println(mapLengthAndDog);

        Map<Boolean, List<Dog>> partitionMap = dogListSample.stream().collect
                (Collectors.partitioningBy(d -> d.getName().endsWith("o")));
        System.out.println(partitionMap);

        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(101);
        numList.add(7);
        numList.add(13);

        IntStream streamInt = numList.stream().mapToInt(Integer::valueOf);
        IntSummaryStatistics statistics = streamInt.summaryStatistics();
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getSum());

        numList.stream().filter(i -> i % 13 == 0).peek(i -> System.out.println("Element found: " + i))
                .collect(Collectors.toList());
    }
}
