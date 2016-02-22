package pattern.mvc.view;

/**
 * Created by gauravs on 16/2/16.
 */
public class LoginFormEvent {
    private String username;
    private String password;

    public LoginFormEvent(String username, String password) {
        this.username = username;
        this.password = password;
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
