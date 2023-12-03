package working_with_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 04/12/2023
 * <p>
 * Class: Q88
 */

public class Q88 {
    public static void main(String[] args) {
        List<People> peopleList = List.of(new People(1, "Yen"), new People(10, "Thanh"),
                new People(9, "Bich"), new People(99, "Nguyet"), new People(99, "Anh"));
        List<People> peopleArrList = new ArrayList<>(peopleList);
        Stream<People> peopleStream = peopleList.stream();
        peopleStream.sorted().forEach(System.out::println);
        peopleList.stream().sorted(Comparator.comparing(People::getId).thenComparing(People::getName))
                .collect(Collectors.toList());
        Collections.sort(peopleArrList, Comparator.comparing(People::getId).thenComparing(People::getName));
        System.out.println(peopleArrList);
        Set<People> setPeople = new TreeSet<>(peopleArrList);
//        setPeople.addAll(peopleArrList);
        System.out.println(setPeople);
    }
}

class People implements Comparable<People> {
    private int id;
    private String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(People o) {
        return id - o.id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
