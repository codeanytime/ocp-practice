package exception;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author thanhch
 * <p>
 * Date: 07/11/2023
 * <p>
 * Class: InternalResource
 */
public class InternalResource implements Closeable {
    @Override
    public void close() {
        System.out.println("Internal resource close");
    }
}
