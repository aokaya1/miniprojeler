package Mini_Projects.Login;

public class User {
    private String name;
    private String username;
    private String email;
    private String pasword;

    public User() {
    }

    public User(String name, String username, String email, String pasword) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.pasword = pasword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
}
