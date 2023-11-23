package concurrency_udemy;

import java.util.concurrent.Executors;

/**
 * @author thanhch
 * <p>
 * Date: 21/11/2023
 * <p>
 * Class: FutureDemo
 */
public class FutureDemo {
    static void print() {
        try {
            Thread.sleep(3000);
            System.out.println("print");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        var service = Executors.newSingleThreadExecutor();
        var f = service.submit(FutureDemo::print);
        System.out.println("test");
    }
}
