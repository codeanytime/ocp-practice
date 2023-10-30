package functional_programing.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 30/10/2023
 * <p>
 * Class: LambdaVariableScope
 */
public class LambdaVariableScope {
    static int d = 10;
    int c;
    private Integer test(int a, int b) {
//        a = 0; // error because a reassign and not be final
        BiFunction<Integer, Integer, Integer> sumFunc = (x, y) -> a + b + c + d;
        return sumFunc.apply(a, b);
    }

    public static void main(String[] args) throws Exception {
        LambdaVariableScope scope = new LambdaVariableScope();
        System.out.println(scope.test(1, 2));
        System.out.println(scope.test(2, 3));
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("ello");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("h");
        Predicate<String> predicate = stringLengthGreaterThanParam(1);
        Predicate<String> predicate2 = s -> s.startsWith("h");
        Predicate<String> predicateComposite = predicate.or(predicate2);
        Predicate<String> predicateNegate = predicate.negate();
        List<String> result = list.stream().filter(predicateComposite::test).collect(Collectors.toList());
        List<String> resultNegate = list.stream().filter(predicateNegate::test).collect(Collectors.toList());

        String str = list.stream().filter(predicateComposite).findFirst().orElseThrow(() -> new Exception("Not found"));
        System.out.println(str);
        System.out.println(result);
        System.out.println(resultNegate);

        TriFunctional maxInThreeNumber = (o, o2, o3) -> Math.max((Integer) o, Math.max((Integer) o2, (Integer) o3));
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        System.out.println(maxInThreeNumber.apply(1000, 2, 100));

        Function<List<String>, String> function = x -> x.get(0);
        UnaryOperator<Long> unaryOperator = x -> 3l;
//        UnaryOperator<Long> unaryOperator1 = x -> 3.14; -> error because 3.14 not long
        Predicate<String> ex4 = String::isEmpty;
//        Predicate ex4 = String::isEmpty -> Error because not type and isEmpty is method of String not object.
    }

    static Predicate<String> stringLengthGreaterThanParam(Integer param) {
        return s -> s.length() > param;
    }
}
