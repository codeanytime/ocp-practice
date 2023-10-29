package generic_and_collections;

import common.PrintCollection;
import generic_and_collections.model.Dog;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

/**
 * @author thanhch
 * <p>
 * Date: 28/10/2023
 * <p>
 * Class: CompareDemo
 */
public class CompareDemo {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(1, "mickey"));
        dogList.add(new Dog(3, "rickey"));
        dogList.add(new Dog(2, "spacey"));
        // Exception when key to compare is null.
//        dogList.add(new Dog(2, null));
        PrintCollection.printAllElement(dogList);

        // Use lamda and method reference in java 8
        Comparator<Dog> dogComparator = Comparator.comparingInt(Dog::getId);

        // Use before java 8
        Comparator<Dog> dogNameComparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        // Use comparing
        Comparator<Dog> dogNameReverseComparator = Comparator.comparing(d -> d.getName(), Comparator.reverseOrder());

        dogList.sort(dogComparator);
        PrintCollection.printAllElement(dogList);
        dogList.sort(dogNameComparator);
        PrintCollection.printAllElement(dogList);
        Collections.sort(dogList, dogNameReverseComparator);
        PrintCollection.printAllElement(dogList);

        List<Integer> intList;
        Stream<Integer> intStream = Stream.iterate(100, n -> n - 1).limit(50);
        intList = intStream.collect(Collectors.toList());
        Collections.sort(intList);
        PrintCollection.printAllElement(intList);
        Integer search = Collections.binarySearch(intList, 60);
        System.out.println("Search " + search); // -> return index in list of 60 (9)
        Collections.reverse(intList);
        Integer searchNotFound = Collections.binarySearch(intList, 60);
        System.out.println("Not found " + searchNotFound); // -> return -1
        intList.removeIf(i -> i % 2 == 0);

        BiFunction<Dog, Dog, Dog> dogConcat = (d1, d2) -> {
            Dog dog = new Dog(d1.getId() + d2.getId(), d1.getName() + " " + d2.getName());
            return dog;
        };

        Dog d1 = new Dog(1, "Mickey");
        Dog d2 = new Dog(2, "M");
        Dog d3 = dogConcat.apply(d1, d2);
        System.out.println(d3);
    }
}
