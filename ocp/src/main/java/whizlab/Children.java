package whizlab;

/**
 * @author thanhch
 * <p>
 * Date: 08/11/2023
 * <p>
 * Class: Children
 */
public class Children extends AbstractDemo implements InterfaceDemo{

    public static void main(String[] args) {
        AbstractDemo c = new Children();
        c.print();
        c.printName();
    }
}
