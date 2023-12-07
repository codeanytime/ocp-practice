package working_with_stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 07/12/2023
 * <p>
 * Class: Q114
 */
public class Q114 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("9781976704031", 9.99));
        books.add(new Book("9781976704032", 15.99));

        var b = books.stream().reduce(new Book("9781976704033", 0), (b1, b2) -> {
            b1.price = b1.price + b2.price;
            return new Book(b1.isbn, b1.price);
        });
        books.add(b);

        books.parallelStream().reduce((x, y) -> x.price > y.price ? x : y).ifPresent(System.out::println);
    }
}

class Book {
    String isbn;
    double price;

    public Book(String isbn, double price) {
        this.isbn = isbn;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", price=" + price +
                '}';
    }
}
