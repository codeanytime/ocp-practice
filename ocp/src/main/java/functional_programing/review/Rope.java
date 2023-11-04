package functional_programing.review;

/**
 * @author thanhch
 * <p>
 * Date: 04/11/2023
 * <p>
 * Class: Rope
 */
class Rope {
    int length;
    String color;

    Rope(int length, String color) {
        this.length = length;
        this.color = color;
    }

    public String toString() {
        return "Rope [" + color + ", " + length + "]";
    }

     static class RedRopeFilter {
        boolean filter(Rope rope) {
            return rope.color.equalsIgnoreCase("Red");
        }

        static boolean filter2() {
            return true;
        }
    }
}
