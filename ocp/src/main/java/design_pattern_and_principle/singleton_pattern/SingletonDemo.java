package design_pattern_and_principle.singleton_pattern;

/**
 * @author thanhch
 * <p>
 * Date: 23/10/2023
 * <p>
 * Class: SingletonDemo
 */
public class SingletonDemo {
    public static void main(String[] args) {
        SingleConnect connect1 = SingleConnect.getConnect();
        SingleConnect connect2 = SingleConnect.getConnect();
        System.out.println(connect1);
        System.out.println(connect2);
    }
}
