package working_with_array_collection_2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author thanhch
 * <p>
 * Date: 16/12/2023
 * <p>
 * Class: Q57
 */
public class Q57 {
    public static void main(String[] args) {
        Comparator<StudentQ57> customComparator =
                (s1, s2) -> s1.getName().compareTo(s2.getName()) + s1.getAge() - s2.getAge();
        Set<StudentQ57> set = new TreeSet<>(customComparator);
        set.add(new StudentQ57("thanhch", 23));
        set.add(new StudentQ57("thanhch", 24));
        set.add(new StudentQ57("thanhch", 2));
        System.out.println(set);
    }
}

class StudentQ57 {
    private String name;
    private int age;

    public StudentQ57(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
