package classDesign;

import classDesign.innerClass.Outer;

/**
 * @author thanhch
 * <p>
 * Date: 17/10/2023
 * <p>
 * Class: InnerClassMain
 */
public class InnerClassMain {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.printNameOuter();
        Outer.Inner inner = outer.new Inner();
        inner.printName();
    }
}
