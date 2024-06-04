package practice.stream.advanced.example;

import practice.stream.advanced.domain.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * @author thanhch
 * <p>
 * Date: 04/06/2024
 * <p>
 * Class: Ex4
 */
public class Ex4 {
    public static void main(String[] args) {
        List<Movie> movies = InitData.loadDataMovie();
        List<Director> directorList = movies.stream()
                .map(Movie::getDirectors)
                .flatMap(Collection::stream)
                .distinct()
                .collect(toList());
        System.out.println(directorList);

        Stream<DirectorGenre> stream =
                directorList.stream()
                        .flatMap(director -> director.getMovies()
                                .stream()
                                .map(Movie::getGenres)
                                .flatMap(Collection::stream)
                                .map(genre -> new DirectorGenre(director, genre))
                                .collect(toList()).stream()
                        );
        Map<Director, Map<Genre, Long>> directorGenreList =
                stream.collect(
                        groupingBy(
                                DirectorGenre::getKey,
                                groupingBy(DirectorGenre::getValue, counting())
                        )
                );
        System.out.println(directorGenreList);
    }
}
