package design_pattern_and_principle.singleton_pattern;

/**
 * @author thanhch
 * <p>
 * Date: 23/10/2023
 * <p>
 * Class: SingleConnect
 */
public class SingleConnect {
    private int sessionId;
    private String url;

    public static volatile SingleConnect connect;

    public static SingleConnect getConnect() {
        if (connect == null) {
            synchronized(SingleConnect.class) {
                if (connect == null) {
                    connect = new SingleConnect(1, "google.com");
                }
            }
        }
        return connect;
    }

    private SingleConnect(int sessionId, String url) {
        this.sessionId = sessionId;
        this.url = url;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
