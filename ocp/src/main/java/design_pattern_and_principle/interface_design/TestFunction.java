package design_pattern_and_principle.interface_design;

/**
 * @author thanhch
 * <p>
 * Date: 22/10/2023
 * <p>
 * Class: TestFunction
 */
public class TestFunction implements FunctionalDemo, Demo2{
    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public void testDefault() {
        Demo2.super.testDefault();
    }

    public static void main(String[] args) {
        FunctionalDemo f = new TestFunction();
        f.test();
        f.testDefault();
        FunctionalDemo.testStatic();
    }
}
