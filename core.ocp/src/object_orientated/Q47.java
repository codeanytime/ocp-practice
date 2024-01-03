package object_orientated;

/**
 * @author thanhch
 * <p>
 * Date: 02/01/2024
 * <p>
 * Class: Q47
 */
public class Q47 {
    public static void main(String[] args) {
        final int i = 100;
//        private int i = 100; --> Not allow
        final int j = 200;
        Rectangle rect = new Rectangle(i, j);
        System.out.println(String.join(",", rect.getHeight() + "", rect.getWidth() + ""));
    }
}

class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
