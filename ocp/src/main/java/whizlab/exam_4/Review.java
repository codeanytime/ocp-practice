package whizlab.exam_4;

import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 16/11/2023
 * <p>
 * Class: Review
 */
public class Review {
    static Person getPerson() {
        throw new RuntimeException("HEHE");
    }

    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("hello.txt");
        Files.deleteIfExists(path1);
        Files.writeString(path1, "hello world");
        Path path2 = Paths.get("copy.txt");
        String s = Files.readString(path1);
        System.out.println(s);
        Files.move(path1, path2, StandardCopyOption.REPLACE_EXISTING);

        EnumDemo demo = EnumDemo.EMPLOYEE;
        System.out.println(demo.rate);

        Person person = new Person<>("thanh");
        System.out.println(person.name);

        Person p1 = new Person("thanh");
        Person p2 = new Person("huy");
//        Person p3 = Stream.of(p1, p2).findAny().orElse(getPerson());
//        System.out.println(p1.equals(p3) + " " + p2.equals(p3));

        List<String> list1 = List.of("A", "B");
        String[] arr1 = {"C"};
        String[] arr2 = list1.toArray(arr1);
        System.out.println(Arrays.asList(arr2));
    }
}
