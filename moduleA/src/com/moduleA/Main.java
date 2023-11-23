package com.moduleA;

import com.moduleB.BClass;
import com.moduleB1.B1;

/**
 * @author thanhch
 * <p>
 * Date: 24/11/2023
 * <p>
 * Class: Main
 */
public class Main {
    public static void main(String[] args) {
        BClass bClass = new BClass("cv");
        System.out.println(bClass.getName());

        B1 b1 = new B1("an");
        System.out.println(b1.getName());
    }
}
