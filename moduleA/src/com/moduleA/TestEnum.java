package com.moduleA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * createdDate: 28/11/2023
 * Type: Enum
 */
public enum TestEnum {
    DIRECT("tructiep"), INDIRECT("giantiep");
    String type;
    public final List<String> TYPE_DEFAULT = new ArrayList<>();

    TestEnum(String type) {
        this.type = type;
        TYPE_DEFAULT.add("NEW");
    }
}
