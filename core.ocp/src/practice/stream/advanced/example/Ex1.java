package practice.stream.advanced.example;

import practice.stream.advanced.domain.City;
import practice.stream.advanced.domain.Country;
import practice.stream.advanced.domain.InitData;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 31/05/2024
 * <p>
 * Class: Ex1
 */
public class Ex1 {
    public static void main(String[] args) {
        List<Country> countries = InitData.loadDataCountries();
        List<City> citiesHasPopulationHighestOfCountry = countries.stream()
                .map(country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        System.out.println(citiesHasPopulationHighestOfCountry);
    }
}
