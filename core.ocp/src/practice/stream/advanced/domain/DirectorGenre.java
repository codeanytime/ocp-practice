package practice.stream.advanced.domain;

import java.util.Map;

/**
 * @author thanhch
 * <p>
 * Date: 04/06/2024
 * <p>
 * Class: DirectorGenre
 */
public class DirectorGenre implements Map.Entry<Director, Genre> {
    private Director director;
    private Genre genre;

    public DirectorGenre(Director director, Genre genre) {
        this.director = director;
        this.genre = genre;
    }

    @Override
    public Director getKey() {
        return director;
    }

    @Override
    public Genre getValue() {
        return genre;
    }

    @Override
    public Genre setValue(Genre genre) {
        this.genre = genre;
        return genre;
    }

    @Override
    public String toString() {
        return "DirectorGenre{" +
                "director=" + director +
                ", genre=" + genre +
                '}';
    }
}
