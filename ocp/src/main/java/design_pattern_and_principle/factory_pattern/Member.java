package design_pattern_and_principle.factory_pattern;

/**
 * @author thanhch
 * <p>
 * Date: 24/10/2023
 * <p>
 * Class: Member
 */
public class Member extends Employee {
    public Member(int id, String name, int rank) {
        super(id, name, rank);
    }

    @Override
    int calculateSalary() {
        return 10;
    }
}
