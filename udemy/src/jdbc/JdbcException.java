package jdbc;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @author thanhch
 * <p>
 * Date: 22/11/2023
 * <p>
 * Class: JdbcException
 */
public class JdbcException {
    public static void main(String[] args) throws SQLException {
        ResourceBundle res = ResourceBundle.getBundle("db");
        String url = res.getString("url");
        String username = res.getString("username");
        String password = res.getString("password");

        Connection connection = null;
//        try (var con =DriverManager.getConnection(url, username, password)) {
//            {
//                connection = con;
//            }
//        } catch (SQLException e) {
//            System.out.println("An error occur");
//        }
//        var stmt = connection.createStatement();
//        stmt.executeUpdate("INSERT INTO public.posts(\n" +
//                "\tpost_id, title, content, created_by, updated_by)\n" +
//                "\tVALUES (2, 'hihi', 'hehe', 1, 2)");
//        stmt.close();
//        connection.close();

        Statement stmt = null;
        try {
            var con = DriverManager.getConnection(url, username, password);
            {
                connection = con;
            }
            stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//            con.setAutoCommit(true);
            int deleted = stmt.executeUpdate("delete from posts where post_id != 1");
            int inserted = stmt.executeUpdate("INSERT INTO public.posts(\n" +
                    "\tpost_id, title, content, created_by, updated_by)\n" +
                    "\tVALUES (2, 'hihi', 'hehe', 1, 2)");
            var updated = stmt.executeUpdate("UPDATE public.posts SET post_id=3, title='update title 3' where post_id = 2");
            System.out.println("INSERT: " + inserted);
            System.out.println("UPDATE: " + updated);
            System.out.println("DELETE: " + deleted);
            var rs = stmt.executeQuery("select * from posts where post_id >= 1");
            while (rs.next()) {
                String postId = rs.getString("post_id");
                String title = rs.getString("title");
                System.out.println(postId + " " + title);
                System.out.println(rs);
                rs.absolute(1);
                if (postId.equals("3")) {
                    int inserted2 = stmt.executeUpdate("INSERT INTO public.posts(\n" +
                            "\tpost_id, title, content, created_by, updated_by)\n" +
                            "\tVALUES (2, 'hihi', 'hehe', 1, 2)");
                    rs.updateString(2, "hehehehehehe");
                    rs.updateRow();

                    int deleteSecond = stmt.executeUpdate("delete from posts where post_id = 3");
                    System.out.println("DELETE SECOND: " + deleteSecond);
                }
            }
        } catch (SQLException e) {
            System.out.println("An error occur");
        } finally {
            stmt.close();
            connection.close();
        }
    }
}
