package working_with_stream;

/**
 * @author thanhch
 * <p>
 * Date: 04/12/2023
 * <p>
 * Class: Q99
 */
public class Q96 {

}

enum Color {
    YELLOW,RED,GREEN;
}

class TrafficLight {
    String msg;
    Color color;

    public TrafficLight(String msg, Color color) {
        this.msg = msg;
        this.color = color;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
