package design_pattern_and_principle.factory_pattern;

/**
 * @author thanhch
 * <p>
 * Date: 24/10/2023
 * <p>
 * Class: DemoFactory
 */
public class DemoFactoryMain {
    public static void main(String[] args) {
        Employee member = EmployeeFactory.getEmployee(1, "thanhch", 3, "Member");
        System.out.println(member.calculateSalary());
        Employee leader = EmployeeFactory.getEmployee(1, "ducnn", 10, "Member");
        System.out.println(leader.calculateSalary());
    }
}
