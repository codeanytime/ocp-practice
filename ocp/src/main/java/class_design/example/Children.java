package class_design.example;

/**
 * @author thanhch
 * <p>
 * Date: 22/10/2023
 * <p>
 * Class: Children
 */
public class Children extends Parent {
    int old = 32;
    @Override
    protected void printStr() {
        System.out.println("Children has " + old + " year olds");
    }
}
