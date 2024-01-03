package object_orientated;

/**
 * @author thanhch
 * <p>
 * Date: 03/01/2024
 * <p>
 * Class: Q68
 */
public class Q68 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.m1();
    }
}

class Base {
    protected void m1() {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {
    public void m1() {
        System.out.println("Derived: m1()");
    }
}
