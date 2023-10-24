package design_pattern_and_principle.factory_pattern;

/**
 * @author thanhch
 * <p>
 * Date: 24/10/2023
 * <p>
 * Class: Leader
 */
public class Leader extends Employee {

    public Leader(int id, String name, int rank) {
        super(id, name, rank);
    }

    @Override
    int calculateSalary() {
        return 100;
    }
}
