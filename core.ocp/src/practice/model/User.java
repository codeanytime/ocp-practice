package practice.model;

/**
 * @author thanhch
 * <p>
 * Date: 29/05/2024
 * <p>
 * Class: User
 */
public class User {
    private int id;
    private String username;
    private String email;
    private University university;

    public User(int id, String username, String email, University university) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.university = university;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", university=" + university +
                '}';
    }
}
