package exception;

/**
 * @author thanhch
 * <p>
 * Date: 07/11/2023
 * <p>
 * Class: AssertDemo
 */
public class AssertDemo {
    // -ea VM option to enable assert
    public static void main(String[] args) {
        String s = null;
//        assert s != null : "hello";
        int a = 0;
        assert a++ > 0 : "a++ not greater than zero";
    }
}
