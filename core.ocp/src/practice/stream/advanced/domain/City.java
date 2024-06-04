package practice.stream.advanced.domain;

import java.util.List;
import java.util.Optional;

/**
 * @author thanhch
 * <p>
 * Date: 31/05/2024
 * <p>
 * Class: City
 */
public class City {
    private int id;
    private String name;
    private int population;
    private String countryCode;

    public City() {
    }

    public City(int id, String name, String countryCode, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.countryCode = countryCode;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "City [id=" + id + ", name=" + name + ", population=" + population + ", countryCode=" + countryCode + "]";
    }

    public static Optional<Country> findByCountryCode(List<Country> input, String countryCode) {
        return input.stream().filter(c -> c.getCode().equals(countryCode)).findFirst();
    }

}
