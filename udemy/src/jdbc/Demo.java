package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author thanhch
 * <p>
 * Date: 23/11/2023
 * <p>
 * Class: Demo
 */
public class Demo {
    public static void main(String[] args) {
        ResourceBundle res = ResourceBundle.getBundle("db");
        String url = res.getString("url");
        String username = res.getString("username");
        String password = res.getString("password");

        var sql = "select * from posts where post_id = ?";
        try (var con = DriverManager.getConnection(url, username, password);
        var stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, 1);
            var rs = stmt.executeQuery(sql);
            System.out.println(rs.next());
        } catch (SQLException e) {
            System.out.println("Exception occur");
        }
    }
}
