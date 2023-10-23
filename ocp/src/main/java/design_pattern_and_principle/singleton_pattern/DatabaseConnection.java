package design_pattern_and_principle.singleton_pattern;

/**
 * @author thanhch
 * <p>
 * Date: 23/10/2023
 * <p>
 * Class: DatabaseConnection
 */
public class DatabaseConnection {
    private String url;
    private String username;
    private String password;
    public static int NUMBER_ACCESS = 0;

    private static DatabaseConnection instance;

    // if not synchronize -> not thread safe, it's lazy instantiation
    public static synchronized DatabaseConnection getDbConnection() {
        NUMBER_ACCESS++;
        if (instance == null) {
            instance = new DatabaseConnection("localhost:5432", "root", "123");
        }
        return instance;
    }

    private DatabaseConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
