package whizlab;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 08/11/2023
 * <p>
 * Class: Review
 */
public class Review {
    public static void main(String[] args) {
        var num = 2;
        char c = 10;
        StringBuilder s = new StringBuilder("hello");
        String s1 = "hello";
        System.out.println(s.equals(s1));
        System.out.println(c % 10);
        switch (num + 2) {
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("Default " + num);

        }

        Path path1 = Paths.get("a.txt");
        Path path2 = Paths.get("b/c.txt");
        Path path3 = Paths.get("d/./../");
        Path path4 = path2.toAbsolutePath();
        System.out.println("PATH 4 :" + path4);
        System.out.println("PATH 3: " + path3.isAbsolute());
        System.out.println("PATH 1: " + path1.isAbsolute());
        System.out.println("PATH 2: " + path2.isAbsolute());
        System.out.println(path2.relativize(path1));
        System.out.println(path3.normalize());
        System.out.println("normalize path2: " + path2.normalize());
        System.out.println("normalize path1: " + path1.normalize());
        float x = 90;
        System.out.println(Math.sin(90));

        //Normalize
        Path pathNormalize = Paths.get("/./../ab/c/d");
        System.out.println("ABSOLUTE " + pathNormalize.isAbsolute());
        System.out.println("NORMALIZE " + pathNormalize.normalize());

        Set<Integer> set = new HashSet<>();
        set.add(-1);
        set.add(10);
        set.add(5);
        set.add(-99);
        set.add(1);
        System.out.println("SET: " + set);

        List<Integer> list = new ArrayList<>(set);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        System.out.println("LIST: " + list);
        System.out.println("SORTED: " + sortedList);
        System.out.println(sum(1, 2));
        System.out.println(sum(1.0f, 2.0f));
        System.out.println(sum(Integer.valueOf(1), Integer.valueOf(10)));
    }

    static double sum(double a, double b) {
        return 3.14;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(Integer a, Integer b) {
        return a * b;
    }

    static float sum(long a, long b) {
        return (a * b)/2;
    }

    static int sum (int ...a) {
        return a[0];
    }
}
