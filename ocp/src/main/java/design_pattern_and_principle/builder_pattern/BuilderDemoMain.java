package design_pattern_and_principle.builder_pattern;

/**
 * @author thanhch
 * <p>
 * Date: 24/10/2023
 * <p>
 * Class: BuilderDemoMain
 */
public class BuilderDemoMain {
    public static void main(String[] args) {
        Student s1 = Student.builder().setId(1).build();
        System.out.println(s1);
        Student s2 = Student.builder().setId(1).setAddress("Ha noi").build();
        System.out.println(s2);
    }
}
