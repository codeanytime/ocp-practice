package exception;

/**
 * @author thanhch
 * <p>
 * Date: 07/11/2023
 * <p>
 * Class: ExternalResource
 */
public class ExternalResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Close external Resource");
        throw new RuntimeException("External close exception");
    }
}
