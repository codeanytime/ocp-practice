package whizlab;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author thanhch
 * <p>
 * Date: 08/11/2023
 * <p>
 * Class: Review
 */
public class Review {
    public static void main(String[] args) {
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }
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
        System.out.println(path1.isAbsolute());
        System.out.println(path2.relativize(path1));
        System.out.println("normalize path2: " + path2.normalize());
        System.out.println("normalize path1: " + path1.normalize());
        float x = 90;
        System.out.println(Math.sin(90));
    }
}
