package class_design.example;

/**
 * @author thanhch
 * <p>
 * Date: 22/10/2023
 * <p>
 * Class: Parent
 */
public class Parent {
    int old = 50;
    String type;

    protected void printStr() {
        System.out.println("Parent has " + old + " old");
    }
}
