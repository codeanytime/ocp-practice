package design_pattern_and_principle.factory_pattern;

/**
 * @author thanhch
 * <p>
 * Date: 24/10/2023
 * <p>
 * Class: EmployeeFactory
 */
public class EmployeeFactory {
    public static Employee getEmployee(int id, String name, int rank, String position) {
        switch (position) {
            case "Leader":
                return new Leader(id, name, rank);
            case "Member":
                return new Member(id, name, rank);
        }
        throw new UnsupportedOperationException("No match");
    }
}
