package design_pattern_and_principle.builder_pattern;

/**
 * @author thanhch
 * <p>
 * Date: 24/10/2023
 * <p>
 * Class: Student
 */
public class Student {
    private int id;
    private String name;
    private String address;

    private Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:" + name +
                ", address:" + address +
                '}';
    }

    public static class StudentBuilder {
        private int id;
        private String name;
        private String address;

        public StudentBuilder() {
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(id, name, address);
        }
    }
}
