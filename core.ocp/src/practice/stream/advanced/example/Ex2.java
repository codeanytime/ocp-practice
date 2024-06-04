package practice.stream.advanced.example;

import practice.stream.advanced.domain.City;
import practice.stream.advanced.domain.Country;
import practice.stream.advanced.domain.InitData;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 31/05/2024
 * <p>
 * Class: Ex2
 */
public class Ex2 {
    public static void main(String[] args) {
        List<Country> countries = InitData.loadDataCountries();
        Map<String, List<Country>> mapContinentCityHasPopulatedHighest = countries.stream()
                .collect(Collectors.groupingBy(Country::getContinent, Collectors
                        .toList()));
        System.out.println(mapContinentCityHasPopulatedHighest);
        List<City> cities = countries.stream().flatMap(country ->
                country.getCities().stream()).collect(Collectors.toList());
        System.out.println(cities);
        Map<String, Optional<City>> highPopulatedCitiesByContinent = countries.stream()
                .flatMap(country -> country.getCities().stream())
                .collect(Collectors.groupingBy(
                        city -> City.findByCountryCode(countries, city.getCountryCode())
                                .orElseThrow(() -> new RuntimeException("NULL")).getContinent(),
                        Collectors.maxBy(Comparator.comparing(City::getPopulation))
                ));
        System.out.println(highPopulatedCitiesByContinent);
        List<City> cityList = countries.stream().flatMap(country -> country.getCities().stream()).collect(Collectors.toList());
        Map<String, Optional<City>> highOther = cityList.stream()
                .collect(Collectors.groupingBy(
                        city -> City.findByCountryCode(countries, city.getCountryCode())
                                .orElseThrow(() -> new RuntimeException("NULL")).getContinent(),
                        Collectors.maxBy(Comparator.comparing(City::getPopulation))
                ));
        System.out.println(highOther);

        Map<String, City> high3 = cityList.stream()
                .collect(Collectors.groupingBy(
                        city -> City.findByCountryCode(countries, city.getCountryCode())
                                .orElseThrow(() -> new RuntimeException()).getContinent(),
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(City::getPopulation)),
                                Optional::get
                        )
                ));
        System.out.println(high3);
    }
}
