package smartphoneapp;

public class Smartphone {
    private String themeSetting;
    private boolean notificationPreference;
    private String username;
    private String password;

    private Smartphone() {}

    public static Smartphone newInstance() {
        return new Smartphone();
    }

    public void setThemeSetting(String themeSetting) {
        this.themeSetting = themeSetting;
    }

    public void setNotificationPreference(boolean notificationPreference) {
        this.notificationPreference = notificationPreference;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getThemeSetting() {
        return themeSetting;
    }

    public boolean getNotificationPreference() {
        return notificationPreference;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean validateCredentials(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}