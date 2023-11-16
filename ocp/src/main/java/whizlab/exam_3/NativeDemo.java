package whizlab.exam_3;

/**
 * @author thanhch
 * <p>
 * Date: 16/11/2023
 * <p>
 * Class: NativeDemo
 */
public class NativeDemo {
    public native float run_something_very_important(float a, float b);

    public static void main(String[] args) {
        System.loadLibrary("hello.dll");
    }
}
