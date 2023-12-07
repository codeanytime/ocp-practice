package model;

import java.io.Closeable;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: CustomFileResource
 */
public class CustomFileResource implements Closeable {
    @Override
    public void close() {
        System.err.println("Close Custom file");
    }
}
