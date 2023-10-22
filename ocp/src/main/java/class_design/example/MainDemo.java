package class_design.example;

/**
 * @author thanhch
 * <p>
 * Date: 22/10/2023
 * <p>
 * Class: MainDemo
 */
public class MainDemo {
    public static void main(String[] args) {
        Parent p = new Children();
        System.out.println(p.old);
        Children c = new Children();
        System.out.println(c.old);
    }
}
