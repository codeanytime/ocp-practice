package working_with_array_collection;

/**
 * @author thanhch
 * <p>
 * Date: 11/12/2023
 * <p>
 * Class: Q65
 */
class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

class AQ65<T> {
    T t;
    public T get() {
        return t;
    }

    void set(T t) {
        this.t = t;
    }
}

public class Q65 {
    public static<T> void print1(AQ65<? extends Animal> obj) {
//        obj.set(new Dog());
        System.out.println(obj.get().getClass());
    }

    public static <T> void print2(AQ65<? super Dog> obj) {
        obj.set(new Dog()); //Line n2
        System.out.println(obj.get().getClass());
    }

    public static void main(String[] args) {
        AQ65<Dog> obj = new AQ65<>();
        print2(obj);
    }
}
