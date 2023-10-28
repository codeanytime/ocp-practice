package generic_and_collections;

import common.PrintCollection;
import generic_and_collections.model.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        Comparator<Dog> dogNameReverseComparator = Comparator.comparing(Dog::getName, Comparator.reverseOrder());

        dogList.sort(dogComparator);
        PrintCollection.printAllElement(dogList);
        dogList.sort(dogNameComparator);
        PrintCollection.printAllElement(dogList);
        Collections.sort(dogList, dogNameReverseComparator);
        PrintCollection.printAllElement(dogList);
    }
}
