package generic_and_collections;

import java.util.*;

/**
 * @author thanhch
 * <p>
 * Date: 26/10/2023
 * <p>
 * Class: Exercise
 */
public class Exercise {
    class A { }

    class B extends A { }

    class C extends B { }

    public static void main(String[] args) {
        A a = new Exercise().new A();
        B b = new Exercise().new B();
        C c = new Exercise().new C();
        List<?> list1 = new ArrayList<A>();
//        list1.add(a);
//        list1.add(b);
//        list1.add(c);
        List<? extends A> list2 = new ArrayList<>();
        List<? super A> list3 = new ArrayList<>();
        list3.add(c);
        list3.add(b);
        list3.add(a);
//        List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
        List<? super B> list5 = new ArrayList<>();
        list5.add(b);
        list5.add(c);
//        list5.add(a);
        List<? super C> list7 = new ArrayList<A>();
        list7.add(c);
//        list7.add(b);
//        List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE

        List<? super String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
//        for(String str : list) {
//            System.out.print(str);
//        }
    }
}
