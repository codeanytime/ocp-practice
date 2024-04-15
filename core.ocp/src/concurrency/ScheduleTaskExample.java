package concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author thanhch
 * <p>
 * Date: 12/04/2024
 * <p>
 * Class: ScheduleTaskExample
 */
public class ScheduleTaskExample {
    static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    static AtomicInteger numExecBeep = new AtomicInteger(0);
    public static void main(String[] args) {
        scheduler.scheduleWithFixedDelay(new BeepTask(), 2, 2, TimeUnit.SECONDS);
    }

    static class BeepTask implements Runnable {

        public void run() {
            if (numExecBeep.get() == 1) {
                scheduler.shutdown();
            }
            numExecBeep.getAndIncrement();
            System.out.println("beep");
        }
    }
}

