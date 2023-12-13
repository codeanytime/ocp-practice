package working_with_array_collection_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author thanhch
 * <p>
 * Date: 13/12/2023
 * <p>
 * Class: Q10
 */
public class Q10 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Liam", "25"));
        list.add(new Person("John", "30"));
        list.add(new Person("Liam", "25"));
        list.add(new Person("Liam", "25"));
        list.remove(new Person("Liam", "25"));
        System.out.println(list);
    }
}

class Person {
    String name;
    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public boolean equals(Person o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }
}
