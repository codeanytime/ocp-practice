package exception;

/**
 * @author thanhch
 * <p>
 * Date: 08/11/2023
 * <p>
 * Class: People
 */
public class People {
    private Student student;
    private int old;

    public People(Student student, int old) {
        this.student = student;
        this.old = old;
    }

    public Student getStudent() {
        return student;
    }

    public int getOld() {
        return old;
    }

    @Override
    public String toString() {
        return "People{" +
                "student=" + student +
                ", old=" + old +
                '}';
    }
}
