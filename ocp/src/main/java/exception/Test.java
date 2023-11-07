package exception;

/**
 * @author thanhch
 * <p>
 * Date: 08/11/2023
 * <p>
 * Class: Test
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student(1, "thanh");
        String name = s.getName();
        name = "huy";
        System.out.println(s);

        People p = new People(s, 32);
        Student s2 = p.getStudent();
        s2 = new Student(2, "huy");
        System.out.println(p);

    }
}
