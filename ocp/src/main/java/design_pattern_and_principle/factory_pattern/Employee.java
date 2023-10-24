package design_pattern_and_principle.factory_pattern;

/**
 * @author thanhch
 * <p>
 * Date: 24/10/2023
 * <p>
 * Class: Employee
 */
public abstract class Employee {
    private int id;
    private String name;
    private int rank;
    private int salary;

    public Employee(int id, String name, int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    abstract int calculateSalary();
}
