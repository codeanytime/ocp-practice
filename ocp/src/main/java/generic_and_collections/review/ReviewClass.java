package generic_and_collections.review;

import common.PrintCollection;
import generic_and_collections.model.Dog;

import java.util.*;

/**
 * @author thanhch
 * <p>
 * Date: 29/10/2023
 * <p>
 * Class: ReviewClass
 */
public class ReviewClass {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.push("ola");
        queue.push("hi");
        queue.push("hello");
        queue.pop();
        while(queue.peek() != null) {
            System.out.println(queue.pop());
        }

        List<Number> numberList = new ArrayList<Number>();
        Set<? super Object> setObjects = new HashSet<Object>();
        setObjects.add(new Dog(1, "mickey"));

        // Question 6
        List<Hello> helloList = new ArrayList();
        helloList.add(new Hello<String>("hello"));
        helloList.add(new Hello(1));

        // Question 7: Hashset order is indeterminate
        Set<Number> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(null);
        numbers.add(10);
        Iterator iterator = numbers.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();

        NavigableSet<String> tree = new TreeSet<>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        PrintCollection.printAllElement(tree);
        System.out.println(tree.ceiling("On")); // -> "One"

        // Question 10: Number before letter, UpperCase before lower case. Note: lowercase();
        String[] values = {"bcd", "def", "abc"};
        Arrays.sort(values, new MyComparator());
        for (String s: values) {
            System.out.println(s);
        }

        // Question 13
//        List<?> testList = new ArrayList<?>(); // Not allow wildcard in right
        List<?> testList = new ArrayList<>();

        // Question 14: Comparable use default. Comparator use when call new TreeSet(SortedSet a)

        // Question 19
        List<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(10);
        intList.remove(new Integer(1)); // Note List contains remove(Object) + remove(index)
//        intList.remove(1); // Remove index, throw exception when index out of bound.
        System.out.println(intList);

        Queue<Integer> intListQueue = new LinkedList<>();
        intListQueue.add(1);
        intListQueue.add(10);
        intListQueue.remove(100);
        intListQueue.remove(null);
        System.out.println(intListQueue);

        // Question 20
        Map map = new HashMap();
        map.put(123, "hello");
        map.put("456", "hi");
        System.out.println(map.containsKey("123"));
        System.out.println(map.containsKey(123));
        System.out.println(map.containsValue("hi"));

        // Question 25: check merge method of map.
        Map<Integer, Integer> map25 = new HashMap<>();
        map25.put(1, 10);
        map25.put(2, 20);
        map25.put(3, null);

        map25.merge(1, 3, (a,b) -> a + b);
        map25.merge(3, 3, (a,b) -> a + b);
        System.out.println(map25);
    }

    // Question 22: Use generic in static method generic before return type
    public static <T> T identity(T t) {
        return t;
    }

    // Question 22: Use generic in static method generic before return type
    public static <T> void identityVoid(T t) {

    }
}
