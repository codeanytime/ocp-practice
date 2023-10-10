package javaIO;

import java.io.Console;

/**
 * @author thanhch
 * <p>
 * Date: 12/10/2023
 * <p>
 * Class: ConsoleDemo
 */
public class ConsoleDemo {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        }
        console.writer().println(1111);
    }
}
