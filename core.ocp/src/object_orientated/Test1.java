package object_orientated;

class Initializer {
    static int num;
    static int den;
    {
        num = 100;
        den = 10;
    }
    static {
        num = num/den;
    }
}

public class Test1 {
    public static void main(String[] args) {
        System.out.println(Initializer.num);
    }
}
