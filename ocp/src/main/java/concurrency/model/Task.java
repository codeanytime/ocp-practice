package concurrency.model;

/**
 * @author thanhch
 * <p>
 * Date: 02/10/2023
 * <p>
 * Class: Task
 */
public class Task implements Runnable {
    public static int count;
    @Override
    public void run() {
        System.out.println("Test runable");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 100; i++) {
            count++;
        }
    }
}
