package object_oriented_2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

interface M {
    public static void log() {
        System.out.println("M");
    }
}

abstract class A {
    public static void log() {
        System.out.println("N");
    }
}

class MyClass extends A implements M{
    public static void log() {
        System.out.println("A");
    }

    public static void test() {
        System.out.println("test");
    }
}

public class Q6 {
    public static void main(String[] args) throws InterruptedException {
        M m = new MyClass();
        MyClass m1 = new MyClass();
        m1.test();
        m1.log();
//        ExecutorService executor = Executors.newScheduledThreadPool(10);
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                longRunning();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).thenAccept(action -> {
            System.out.println("END LONG");
        });
        System.out.println("END MAIN");
        future.join();
//        executor.shutdown();
    }

    public static void longRunning() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("End");
    }
}
