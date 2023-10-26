package generic_and_collections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 26/10/2023
 * <p>
 * Class: Main
 */
public class Main {
    public static void main(String[] args) {
        List<? super Children> childrenList = new ArrayList<>();
        childrenList.add(new Children("c1"));
        childrenList.add(new Children("c2"));
        printLower(childrenList);

        List<Parent> parentList = new ArrayList<>();
        parentList.add(new Parent("c1"));
        parentList.add(new Parent("c2"));
        printLower(parentList);

        List<? super IOException> exceptionList = new ArrayList<>();
//        exceptionList.add(new Exception("1"));
        exceptionList.add(new IOException("io"));
        exceptionList.add(new FileNotFoundException("file not found"));

        List<? super Parent> testList = new ArrayList<>();
        testList.add(new Parent("p2"));
        testList.add(new Children("c2"));
        printLower(testList);

        List<Root> rootList = new ArrayList<>();
        rootList.add(new Root("r1"));
        printUpper(parentList);
        printUpper(rootList);
        printUpper((List<? extends Root>) childrenList);
        printLower(rootList);
        printLower(parentList);
        printLower(childrenList);
    }

    public static void printLower(List<? super Children> input) {
        input.forEach(e -> System.out.println(e.toString()));
    }

    public static void printUpper(List<? extends Root> input) {
        System.out.println("method for all sub-class Parent");
    }
}
