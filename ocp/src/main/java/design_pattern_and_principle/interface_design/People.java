package design_pattern_and_principle.interface_design;

import class_design.Student;

/**
 * @author thanhch
 * <p>
 * Date: 22/10/2023
 * <p>
 * Class: People
 */
public class People implements PrintInterface {
    private String name;
    private int old;

    public People(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public void printName(String name) {
        System.out.println("People's name " + name);
    }

    public static void main(String[] args) {
        PrintInterface p = new People("thanh", 32);
        System.out.println(p);
        People p1 = (People) p;
        if (p1 instanceof PrintInterface) {
            System.out.println("people implement PrintInterface");
        }
        if (p instanceof PrintInterface) {
            System.out.println("p instance of");
        }
        System.out.println(p1.getName());
        System.out.println(p1.getOld());
    }
}
