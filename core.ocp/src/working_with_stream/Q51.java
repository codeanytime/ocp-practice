package working_with_stream;

import java.util.*;
import java.util.Comparator;
import java.util.HashSet;
import java.lang.Comparable;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q51
 */
class Student implements Comparator<Student>, Comparable<Student> {
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
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
    public int compareTo(Student o) {
        return o.getName().compareTo(this.name);
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id - o2.id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Q51 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Thanh"));
        students.add(new Student(99, "An"));
        students.add(new Student(3, "Binh"));
        students.add(new Student(10, "Cong"));
        students.stream().sorted(new Student().reversed()).forEach(System.out::println);

        List<Student> copyList = Collections.unmodifiableList(students);

        // Note sort use for modifiable collection. if unmodifiable => unsupportedOperation.
        Collections.sort(students);
        Set<Student> setStudent = new HashSet<>(copyList);
        System.out.println(students);
        System.out.println(setStudent);
    }
}
