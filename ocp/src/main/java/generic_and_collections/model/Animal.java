package generic_and_collections.model;

/**
 * @author thanhch
 * <p>
 * Date: 28/10/2023
 * <p>
 * Class: Animal
 */
public class Animal<T> {
    T animal;

    public Animal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "{" +
                "animal=" + animal +
                '}';
    }
}
