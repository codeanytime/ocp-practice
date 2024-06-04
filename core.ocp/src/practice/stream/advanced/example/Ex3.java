package practice.stream.advanced.example;

import practice.stream.advanced.domain.Director;
import practice.stream.advanced.domain.InitData;
import practice.stream.advanced.domain.Movie;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 04/06/2024
 * <p>
 * Class: Ex3
 */
public class Ex3 {
    public static void main(String[] args) {
        List<Movie> movies = InitData.loadDataMovie();
        Map<String, Long> mapDirectorMovieCount = movies.stream()
                .flatMap(movie -> movie.getDirectors().stream())
                .collect(Collectors.groupingBy(Director::getName, Collectors.counting()));
        System.out.println(mapDirectorMovieCount);

        Map<String, Long> mapDirectorMovieCount2 = movies.stream()
                .map(Movie::getDirectors)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Director::getName, Collectors.counting()));
        System.out.println(mapDirectorMovieCount2);
    }
}
