package model;

/**
 * @author thanhch
 * <p>
 * Date: 29/11/2023
 * <p>
 * Class: People
 */
public class People {
    private String name;
    private int salary;

    public People(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
