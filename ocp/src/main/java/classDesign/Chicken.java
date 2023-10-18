package classDesign;

import classDesign.abstractClass.Animal;

/**
 * @author thanhch
 * <p>
 * Date: 17/10/2023
 * <p>
 * Class: Chicken
 */
public class Chicken extends Animal {
    String name = "Chicken";

    @Override
    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Animal c = new Chicken();
        c.printName();
    }
}
