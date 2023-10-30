package functional_programing.lambda;

/**
 * @author thanhch
 * <p>
 * createdDate: 30/10/2023
 * Interface TriFunctional
 */
@FunctionalInterface
public interface TriFunctional<T,U,V,R> {
    R apply(T t, U u, V v);
}
