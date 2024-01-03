package object_orientated;

/**
 * @author thanhch
 * <p>
 * Date: 02/01/2024
 * <p>
 * Class: Q59
 */
// Constructor does not allow final, static, abstract.
public class Q59 {
    public static void main(String[] args) {
        MySubClass sub = new MySubClass();
    }
}

class MyClass {
    MyClass() {
        System.out.println(101);
    }
}

class MySubClass extends MyClass {
    MySubClass() {
        System.out.println(202);
    }
}
