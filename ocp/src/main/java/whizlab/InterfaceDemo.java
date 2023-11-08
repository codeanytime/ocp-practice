package whizlab;

/**
 * @author thanhch
 * <p>
 * createdDate: 08/11/2023
 * Interface InterfaceDemo
 */
public interface InterfaceDemo {
    default void print() {
        System.out.println("Interface method");
    }
}
