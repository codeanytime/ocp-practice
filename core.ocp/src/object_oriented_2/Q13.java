package object_oriented_2;

interface P1 {
    int i = 0;
    default void log() {
        System.out.println("LOG");
    }

    static void test_log() {
        System.out.println("test log");
    }
}
public class Q13 implements P1{
    int i = 10;
    public static void main(String[] args) {
        P1 q13 = new Q13();
        q13.log();
        System.out.println(q13.i);

        Q13 q131 = new Q13();
        q131.log();
        System.out.println(q131.i);
        P1.test_log();
    }
}
