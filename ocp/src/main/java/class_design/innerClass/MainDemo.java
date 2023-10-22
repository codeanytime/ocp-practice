package class_design.innerClass;

/**
 * @author thanhch
 * <p>
 * Date: 20/10/2023
 * <p>
 * Class: MainDemo
 */
public class MainDemo {
    public static void main(String[] args) {
        StaticNestedClassDemo.StaticDemo staticDemo = new StaticNestedClassDemo.StaticDemo();
        staticDemo.printHello();
    }
}
