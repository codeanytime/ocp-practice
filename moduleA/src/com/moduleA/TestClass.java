package com.moduleA;

/**
 * @author thanhch
 * <p>
 * Date: 28/11/2023
 * <p>
 * Class: TestClass
 */
@TestAnnotation("...")
public class TestClass {
    private int age;

    private static String name;

    public TestClass(int age) {
        this.age = age;
        name = "thanh";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
