package test;

import class_design.Chicken;
import whizlab.exam_3.A;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 14/11/2023
 * <p>
 * Class: ClassModuleTest
 */
public class ClassModuleTest {
    public static void main(String[] args) {
        A a = new A();
        Chicken c = new Chicken();

        Path path1 = Paths.get("/a/b");
        Path path2 = Paths.get("/a/c");
        System.out.println(path1.resolve(path2));

        MyClass myClass = new MyClass();

        List<Integer> testList1 = Arrays.asList(1, 2); // final but not unmodifiable
        testList1.set(0, 3);
        System.out.println(testList1);

        List<Integer> testList2 = List.of(1, 2);
//        testList2.set(0, 4); -- unmodifiable
        System.out.println(testList2);

        List<Integer> testList3 = List.copyOf(testList2);
//        testList3.set(0, 4); -> Unmodifiable
        System.out.println(testList3);

        System.out.println(path1.relativize(path2));
        System.out.println(path1);
        Path path3 = Paths.get("a/b");
        Path path4 = Paths.get("c/d");
        System.out.println(path3.relativize(path4));
    }
}
