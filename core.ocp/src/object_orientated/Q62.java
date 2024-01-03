package object_orientated;

/**
 * @author thanhch
 * <p>
 * Date: 02/01/2024
 * <p>
 * Class: Q62
 */
public class Q62 {
    public static void main(String[] args) {
        Child c1 = new Child(1000,2000);
        System.out.println(c1.i + "," + c1.j);
        Child c2 = new Child(1000);
        System.out.println(c2.i + "," + c2.j);
    }
}

class Parent {
    int i = 10;
    Parent(int i) {
        super();
        this.i = i;
    }
}

class Child extends Parent {
    int j = 20;

     Child(int j) {
        super(0);
        this.j = j;
    }

    // A constructor should be have super | this but not both
    Child(int i, int j) {
        super(i);
//        this(j);
    }
}
