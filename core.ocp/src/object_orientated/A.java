package object_orientated;

/**
 * @author thanhch
 * <p>
 * Date: 09/01/2024
 * <p>
 * Class: A
 */
public class A {
    B b;

    public A() {
    }

    public A(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
