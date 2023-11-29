package com.moduleA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 28/11/2023
 * <p>
 * Class: DeprecateDemo
 */
@SuppressWarnings({"deprecation"})
public class DeprecateDemo {
    @SuppressWarnings({"removal"})
    void m() {
        @SuppressWarnings({"unchecked"})
        List a = new ArrayList();
        // do something
    }
}
