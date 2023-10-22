package class_design.innerClass;

/**
 * @author thanhch
 * <p>
 * Date: 17/10/2023
 * <p>
 * Class: Outer
 */
public class Outer {
    private String name = "Outer";

    public class Inner {
        public void printName() {
            System.out.println(name);
        }
    }

    public void printNameOuter() {
        Inner inner = new Inner();
        inner.printName();
    }
}
