package working_with_array_collection;

/**
 * @author thanhch
 * <p>
 * Date: 10/12/2023
 * <p>
 * Class: Q58
 */
public class Q58<T> extends AbstractPrinter<T, Integer, String> {
    @Override
    T printT(T t) {
        return null;
    }
}

abstract class AbstractPrinter<T, U, V> {
    abstract T printT(T t);
//    abstract U printU(U u);
//    abstract V printV(V v);
}