package class_design;

/**
 * @author thanhch
 * <p>
 * Date: 19/10/2023
 * <p>
 * Class: EnumDemo
 */
public enum EnumDemo {
    WINTER("Mua dong", 15), SUMMER("Mua he", 30);

    private String season;
    private int temperature;

    EnumDemo(String season, int temperature) {
        this.season = season;
        this.temperature = temperature;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
