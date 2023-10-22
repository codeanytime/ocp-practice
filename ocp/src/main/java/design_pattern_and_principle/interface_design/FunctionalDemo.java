package design_pattern_and_principle.interface_design;

/**
 * @author thanhch
 * <p>
 * createdDate: 22/10/2023
 * Interface FunctionalDemo
 */
@FunctionalInterface
public interface FunctionalDemo {
    void test();
    default void testDefault() {
        System.out.println("Default");
    }

    public static void testStatic() {
        System.out.println("Static");
    }
}
