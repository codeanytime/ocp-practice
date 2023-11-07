package exception;

import java.io.IOException;

/**
 * @author thanhch
 * <p>
 * Date: 07/11/2023
 * <p>
 * Class: ExeptionDemo
 */
public class ExeptionDemo {
    static void mightThrow() throws Exception{
        throw new Exception();
    }
    public static void main(String[] args) throws Exception {
        try (ExternalResource res = new ExternalResource()) {
            System.out.println("OPEN external");
            throw new RuntimeException("TEST");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
            System.out.println(e1.getSuppressed().length);
            System.out.println("Runtime occur");
        }
        for (var i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
