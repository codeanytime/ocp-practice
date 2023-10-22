package class_design;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author thanhch
 * <p>
 * Date: 22/10/2023
 * <p>
 * Class: Student
 */
public class Student {
    private int id;
    private String name, className;

    public Student(int id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(className);
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "thanhch", "56");
        Student s2 = new Student(1, "thanhch", "54");
        System.out.println(s1.equals(s2));
        System.out.println(EnumDemo.WINTER.ordinal());
        if (null instanceof Student) {
            System.out.println("null is ");
        }
        List<Student> list = new ArrayList<>();
        if (list instanceof Student) {
            System.out.println("not compile");
        }
    }
}
