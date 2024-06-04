package practice.stream.advanced.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author thanhch
 * <p>
 * Date: 31/05/2024
 * <p>
 * Class: Director
 */
public class Director {
    private int id;
    private String name;
    private String imdb;
    private List<Movie> movies= new ArrayList<>();

    public Director() {
    }

    public Director(int id, String name, String imdb) {
        this.id = id;
        this.name = name;
        this.imdb = imdb;
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

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Director [id=" + id + ", name=" + name + ", imdb=" + imdb + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director)) return false;
        Director director = (Director) o;
        return getId() == director.getId() && getName().equals(director.getName()) && getImdb().equals(director.getImdb());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getImdb());
    }
}
