package concurrency_udemy;

/**
 * @author thanhch
 * <p>
 * Date: 16/11/2023
 * <p>
 * Class: MyThread
 */
public class MyThread implements Runnable{
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name.toUpperCase());
    }
}
