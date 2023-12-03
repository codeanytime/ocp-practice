package working_with_stream;

import java.util.OptionalInt;

/**
 * @author thanhch
 * <p>
 * Date: 03/12/2023
 * <p>
 * Class: Q62
 */
// Checked Exception
class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

public class Q62 {
    public static void main(String[] args) throws MyException {
        OptionalInt opt = OptionalInt.empty();
        System.out.println(opt.orElseGet(() -> 1));
        System.out.println(opt.orElseThrow(MyException::new));
    }
}
