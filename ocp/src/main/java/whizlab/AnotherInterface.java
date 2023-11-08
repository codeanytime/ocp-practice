package whizlab;

/**
 * @author thanhch
 * <p>
 * Date: 09/11/2023
 * <p>
 * Class: AnotherInterface
 */
public interface AnotherInterface extends InterfaceDemo{
    default void print() {
        System.out.println("ANOTHER INTERFACE CALL");
    }
}
