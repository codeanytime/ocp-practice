package whizlab.exam_4;

import java.util.Locale;

/**
 * @author thanhch
 * <p>
 * Date: 16/11/2023
 * <p>
 * Class: Person
 */
public class Person<T> {
    String name;

    public Person(String name) {
        this.name = name.toUpperCase();
    }
}
