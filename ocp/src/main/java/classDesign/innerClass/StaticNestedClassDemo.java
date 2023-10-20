package classDesign.innerClass;

/**
 * @author thanhch
 * <p>
 * Date: 20/10/2023
 * <p>
 * Class: StaticNestedClassDemo
 */
public class StaticNestedClassDemo {
    String name;
    static class StaticDemo {
        private int old = 32;
        void printHello() {
            System.out.println("hello from static");
            System.out.println("year old: " + old);
        }

//        void printName() {
//            System.out.println(name);
//        }
    }
}
