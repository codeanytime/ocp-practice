package functional_programing.lambda;

import java.util.function.BiFunction;

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

    public static void main(String[] args) {
        LambdaVariableScope scope = new LambdaVariableScope();
        System.out.println(scope.test(1, 2));
        System.out.println(scope.test(2, 3));
    }
}
