package design_pattern_and_principle.singleton_pattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author thanhch
 * <p>
 * Date: 23/10/2023
 * <p>
 * Class: SingletonDemo
 */
public class SingletonDemo {
    public static void main(String[] args) throws InterruptedException {
        SingleConnect connect1 = SingleConnect.getConnect();
        SingleConnect connect2 = SingleConnect.getConnect();
        System.out.println(connect1);
        System.out.println(connect2);

        ExecutorService service = Executors.newFixedThreadPool(5);
        Set<DatabaseConnection> dbConnectList = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            service.execute(() -> {
                dbConnectList.add(DatabaseConnection.getDbConnection());
            });
        }
        TimeUnit.MILLISECONDS.sleep(100);
        if (service != null) {
            service.shutdown();
        }
        dbConnectList.forEach(e -> System.out.println(e));
        System.out.println(dbConnectList.size());
        System.out.println("NUMBER access: " + DatabaseConnection.NUMBER_ACCESS);
    }
}
