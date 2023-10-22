package design_pattern_and_principle.interface_design;

/**
 * @author thanhch
 * <p>
 * createdDate: 22/10/2023
 * Interface Demo2
 */
public interface Demo2 {
    void test();
    default void testDefault() {
        System.out.println("DEFAULT DEMO2");
    }
    static void testStatic() {
        System.out.println("test static demo2");
    }
}
