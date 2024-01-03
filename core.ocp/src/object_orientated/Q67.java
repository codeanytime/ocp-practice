package object_orientated;

/**
 * @author thanhch
 * <p>
 * Date: 03/01/2024
 * <p>
 * Class: Q67
 */
public class Q67 {
    public static void main(String[] args) {
        Animal dog = new Dog("Mic");
    }
}

abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;

    Dog(String breed) {
        super(breed);
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
