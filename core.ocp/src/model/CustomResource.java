package model;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: CustomResource
 */
public class CustomResource implements AutoCloseable {
    @Override
    public void close() {
        System.err.println("Close custom resource");
    }
}
