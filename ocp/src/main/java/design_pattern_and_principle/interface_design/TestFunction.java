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
        int a = 10;
        CheckNum c = s -> System.out.println("a is pair");
        c.check(a);
        LogErrorInterface log = () -> System.out.println("ERROR occur");
        log.logError();
        int b = 100;
        MathInterface math = (s1, s2) -> s1 + s2;
        System.out.println(math.sum(a, b));
        StringFunction strFunction = (x, s) -> s.length() == x;
        StringFunction strFunction2 = (int x, String s) -> s.length() != x;
        System.out.println(strFunction.test(1, "abc"));
        System.out.println(strFunction2.test(1, "abc"));
    }
}
