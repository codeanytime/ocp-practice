package object_orientated;

public class Test {
    static int a = 10000;
    static {
        a = -a--;
    }
    {
        a = -a++;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
