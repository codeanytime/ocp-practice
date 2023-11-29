package main;

import model.People;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 29/11/2023
 * <p>
 * Class: main.Main
 */
public class Main {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("thanhch", 12));
        peopleList.add(new People("huy", 10));
        double avg = peopleList.stream().mapToInt(People::getSalary).average().getAsDouble();
        System.out.println(avg);

        double avg2 = peopleList.stream().mapToLong(People::getSalary).average().getAsDouble();
        System.out.println(avg2);
    }
}
