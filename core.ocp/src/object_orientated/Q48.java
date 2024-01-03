package object_orientated;

/**
 * @author thanhch
 * <p>
 * Date: 02/01/2024
 * <p>
 * Class: Q48
 */
public class Q48 {
    public static void main(String[] args) {
        // Local variable not allow private, only final is accepted
        Book book = new Book("Head First Java", "Kathy Sierra");
        System.out.println(book.getName() + "," + book.getAuthor());
    }
}

class Book {
    private String name;
    private String author;

    public Book() {
    }

    public Book(String name, String author) {
        name = name;
        author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
