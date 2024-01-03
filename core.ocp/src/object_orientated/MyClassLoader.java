package object_orientated;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 10/01/2024
 * <p>
 * Class: MyClassLoader
 */
public class MyClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (name.equals("java.util.ArrayList")) {
            try {
                byte[] classBytes = loadClassData("CustomArrayList");
                return defineClass(name, classBytes, 0, classBytes.length);
            } catch (IOException e) {
                throw new ClassNotFoundException("Class not found: " + name, e);
            }
        }
        return super.findClass(name);
    }

    private byte[] loadClassData(String className) throws IOException {
        // Load the class data from a file or other source
        // and return it as a byte array
        return "hello".getBytes();
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ClassLoader loader = new MyClassLoader();
        Thread.currentThread().setContextClassLoader(loader);
        try {
            Class<?> customArrayListClass = loader.loadClass("java.util.ArrayList");
            // Create instances of the custom ArrayList and use them as needed
            // ...
            System.out.println(customArrayListClass.getSuperclass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
