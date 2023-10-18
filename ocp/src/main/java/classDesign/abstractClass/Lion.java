package classDesign.abstractClass;

/**
 * @author thanhch
 * <p>
 * Date: 17/10/2023
 * <p>
 * Class: Lion
 */
public class Lion {
    private int age;
    private String name;

    public Lion(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return age + Integer.valueOf(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Lion)) return false;
        return ((Lion) obj).name == ((Lion) this).name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
