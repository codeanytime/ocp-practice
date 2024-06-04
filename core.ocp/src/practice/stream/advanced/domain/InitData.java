package practice.stream.advanced.domain;

import java.util.*;

/**
 * @author thanhch
 * <p>
 * Date: 31/05/2024
 * <p>
 * Class: InitData
 */
public class InitData {
    public static List<Country> loadDataCountries() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("USA", "United States", "North America", 9833517, 331002651, 22460, 1));
        countries.get(0).getCities().add(new City(1, "New York City", "USA", 8405837));
        countries.get(0).getCities().add(new City(2, "Los Angeles", "USA", 3990456));
        countries.get(0).getCities().add(new City(3, "Chicago", "USA", 2695598));
        countries.get(0).getCities().add(new City(4, "Houston", "USA", 2320268));
        countries.get(0).getCities().add(new City(5, "Phoenix", "USA", 1732526));

        countries.add(new Country("Canada", "Canada", "North America", 9984670, 37742154, 14490, 2));
        countries.get(1).getCities().add(new City(6, "Toronto", "Canada", 2807411));
        countries.get(1).getCities().add(new City(7, "Montreal", "Canada", 1748361));
        countries.get(1).getCities().add(new City(8, "Vancouver", "Canada", 648415));
        countries.get(1).getCities().add(new City(9, "Calgary", "Canada", 1240000));
        countries.get(1).getCities().add(new City(10, "Ottawa", "Canada", 883391));

        countries.add(new Country("Vietnam", "Vietnam", "Asia", 331, 98300000, 22460, 1));
        countries.get(2).getCities().add(new City(11, "Ho Chi Minh", "Vietnam", 200000));
        countries.get(2).getCities().add(new City(12, "Ha Noi", "Vietnam", 100000));
        countries.get(2).getCities().add(new City(13, "Nha Trang", "Vietnam", 200000));
        countries.get(2).getCities().add(new City(14, "Hoi An", "Vietnam", 100000));

        countries.add(new Country("India", "India", "Asia", 328, 1380000000, 22460, 1));
        countries.get(3).getCities().add(new City(15, "New Delhi", "India", 29000000));
        countries.get(3).getCities().add(new City(16, "Mumbai", "India", 20000000));
        countries.get(3).getCities().add(new City(17, "Bangalore", "India", 10000000));
        countries.get(3).getCities().add(new City(18, "Hyderabad", "India", 10000000));

        // Add Brazil and its cities
        countries.add(new Country("Brazil", "Brazil", "South America", 8515767, 211049527, 1796186, 1));
        countries.get(4).getCities().add(new City(20, "São Paulo", "Brazil", 12176866));
        countries.get(4).getCities().add(new City(21, "Rio de Janeiro", "Brazil", 6320446));
        countries.get(4).getCities().add(new City(22, "Brasília", "Brazil", 2914830));
        countries.get(4).getCities().add(new City(23, "Salvador", "Brazil", 2886698));
        countries.get(4).getCities().add(new City(24, "Fortaleza", "Brazil", 2452185));
        return countries;
    }

    public static List<Movie> loadDataMovie() {
        List<Movie> movies = new ArrayList<>();
        Director d1 = new Director(213, "Frank", "Darabont");
        Director d2 = new Director(201, "Francis Ford", "Coppola");
        Director d3 = new Director(206, "Christopher", "Nolan");
        Director d4 = new Director(205, "Sidney", "Lumet");
        Director d5 = new Director(206, "Steven", "Spielberg");
        Director d6 = new Director(207, "Peter", "Jackson");
        Director d7 = new Director(210, "Quentin", "Tarantino");
        Director d8 = new Director(215, "Robert", "Zemeckis");

        // The Shawshank Redemption
        Movie movie1 = new Movie(1, "The Shawshank Redemption", 1994, "tt0111161");
        movie1.setDirectors(Collections.singletonList(d1));
        movie1.getGenres().add(new Genre(1007, "Drama"));
        movies.add(movie1);

        // The Godfather
        Movie movie2 = new Movie(2, "The Godfather", 1972, "tt0068646");
        movie2.setDirectors(Collections.singletonList(d2));
        movie2.getGenres().add(new Genre(1006, "Crime"));
        movie2.getGenres().add(new Genre(1007, "Drama"));
        movies.add(movie2);

        // The Dark Knight
        Movie movie3 = new Movie(3, "The Dark Knight", 2008, "tt0468569");
        movie3.setDirectors(Collections.singletonList(d3));
        movie3.getGenres().add(new Genre(1001, "Action"));
        movie3.getGenres().add(new Genre(1006, "Crime"));
        movie3.getGenres().add(new Genre(1007, "Drama"));
        movie3.getGenres().add(new Genre(1012, "Thriller"));
        movies.add(movie3);

        // 12 Angry Men
        Movie movie4 = new Movie(4, "12 Angry Men", 1957, "tt0050083");
        movie4.setDirectors(Collections.singletonList(d4));
        movie4.getGenres().add(new Genre(1007, "Drama"));
        movies.add(movie4);

        // Schindler's List
        Movie movie5 = new Movie(5, "Schindler's List", 1993, "tt0110912");
        movie5.setDirectors(Collections.singletonList(d5));
        movie5.getGenres().add(new Genre(1004, "Biography"));
        movie5.getGenres().add(new Genre(1007, "Drama"));
        movie5.getGenres().add(new Genre(1013, "War"));
        movies.add(movie5);

        // The Lord of the Rings: The Return of the King
        Movie movie6 = new Movie(6, "The Lord of the Rings: The Return of the King", 2003, "tt0167261");
        movie6.setDirectors(Collections.singletonList(d6));
        movie6.getGenres().add(new Genre(1002, "Adventure"));
        movie6.getGenres().add(new Genre(1007, "Drama"));
        movie6.getGenres().add(new Genre(1002, "Fantasy"));
        movies.add(movie6);

        // Pulp Fiction
        Movie movie7 = new Movie(7, "Pulp Fiction", 1994, "tt0110912");
        movie7.setDirectors(Collections.singletonList(d7));
        movie7.getGenres().add(new Genre(1006, "Crime"));
        movie7.getGenres().add(new Genre(1007, "Drama"));
        movies.add(movie7);

        // The Lord of the Rings: The Fellowship of the Ring
        Movie movie8 = new Movie(8, "The Lord of the Rings: The Fellowship of the Ring", 2001, "tt0120737");
        movie8.setDirectors(Collections.singletonList(d6));
        movie8.getGenres().add(new Genre(1002, "Adventure"));
        movie8.getGenres().add(new Genre(1007, "Drama"));
        movie8.getGenres().add(new Genre(1002, "Fantasy"));
        movies.add(movie8);

        // The Lord of the Rings: The Two Towers
        Movie movie9 = new Movie(9, "The Lord of the Rings: The Two Towers", 2002, "tt0120738");
        movie9.setDirectors(Collections.singletonList(d6));
        movie9.getGenres().add(new Genre(1002, "Adventure"));
        movie9.getGenres().add(new Genre(1007, "Drama"));
        movie9.getGenres().add(new Genre(1002, "Fantasy"));
        movies.add(movie9);

        // Forrest Gump
        Movie movie10 = new Movie(10, "Forrest Gump", 1994, "tt0119112");
        movie10.setDirectors(Collections.singletonList(d8));
        movie10.getGenres().add(new Genre(1007, "Drama"));
        movie10.getGenres().add(new Genre(1011, "Romance"));
        movies.add(movie10);
        d1.setMovies(Collections.singletonList(movie1));
        d2.setMovies(Collections.singletonList(movie2));
        d3.setMovies(Collections.singletonList(movie3));
        d4.setMovies(Collections.singletonList(movie4));
        d5.setMovies(Collections.singletonList(movie5));
        d6.setMovies(Arrays.asList(movie6, movie8, movie9));
        d8.setMovies(List.of(movie10));

        return movies;
    }
}
