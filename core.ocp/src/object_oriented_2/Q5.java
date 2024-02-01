package object_oriented_2;

/**
 * @author thanhch
 * <p>
 * Date: 23/01/2024
 * <p>
 * Class: Q5
 */
interface Moveable {
    void move();
}

abstract class Animal {
    public void move() {
        System.out.println("Animal move");
    }
}
public class Q5 extends Animal implements Moveable{
    public static void main(String[] args) {
        Q5 q5 = new Q5();
        q5.move();
    }
}
