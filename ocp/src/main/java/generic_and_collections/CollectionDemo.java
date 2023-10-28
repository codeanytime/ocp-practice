package generic_and_collections;

import generic_and_collections.model.Animal;
import generic_and_collections.model.Dog;

import javax.print.Doc;
import java.util.*;

/**
 * @author thanhch
 * <p>
 * Date: 28/10/2023
 * <p>
 * Class: CollectionDemo
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Animal<Dog> animal1 = new Animal<>(new Dog(1, "milu"));
        Animal<Dog> animal3 = new Animal<>(new Dog(3, "gogo"));
        Animal<Dog> animal2 = new Animal<>(new Dog(2, "antoine"));

        Map<Integer, Animal<Dog>> map = new TreeMap<>();
        map.putIfAbsent(animal1.getAnimal().getId(), animal1);
        map.putIfAbsent(animal3.getAnimal().getId(), animal3);
        map.putIfAbsent(animal2.getAnimal().getId(), animal2);
        map.forEach((id, dogAnimal) -> System.out.println(dogAnimal));
        System.out.println(map.size());

        // Use HashSet for unique, natural order
        Set<String> setDog = new HashSet<>();
        map.forEach((id, dogAnimal) -> setDog.add(dogAnimal.getAnimal().getName()));
        System.out.println(setDog);

        // Use treeset for sort
        NavigableSet<String> setDogAlphabet = new TreeSet<>();
        map.forEach((id, dogAnimal) -> setDogAlphabet.add(dogAnimal.getAnimal().getName()));
        System.out.println(setDogAlphabet);
        System.out.println(setDogAlphabet.first());
        System.out.println(setDogAlphabet.last());
    }
}
