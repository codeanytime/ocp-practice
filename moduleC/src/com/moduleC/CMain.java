package com.moduleC;

import com.moduleB.BClass;
import com.moduleB1.B1;

import java.nio.file.Path;

/**
 * @author thanhch
 * <p>
 * Date: 24/11/2023
 * <p>
 * Class: CMain
 */
public class CMain {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println(version);
        var path1 = Path.of("a.txt");
        var path2 = Path.of("b/c.txt");
        System.out.println(path2.relativize(path1));

        BClass c = new BClass("123");
        B1 b1 = new B1("dfa");
        System.out.println(c.getName());
    }
}
