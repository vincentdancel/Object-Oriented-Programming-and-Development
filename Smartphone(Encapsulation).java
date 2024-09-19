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

_________________________________________________________________

    package smartphoneapp;

import javax.swing.JOptionPane;

public class UserPreference {
    public static void main(String[] args) {
       
        Smartphone smartphone = Smartphone.newInstance();

        String themeSetting = JOptionPane.showInputDialog("Enter theme setting:");
        smartphone.setThemeSetting(themeSetting);

        boolean notificationPreference = JOptionPane.showConfirmDialog(null, "Enable notifications?") == 0;
        smartphone.setNotificationPreference(notificationPreference);

        String username = JOptionPane.showInputDialog("Enter username:");
        smartphone.setUsername(username);

        String password = JOptionPane.showInputDialog("Enter password:");
        smartphone.setPassword(password);

        JOptionPane.showMessageDialog(null, "Theme Setting: " + smartphone.getThemeSetting());
        JOptionPane.showMessageDialog(null, "Notification Preference: " + smartphone.getNotificationPreference());
        JOptionPane.showMessageDialog(null, "Username: " + smartphone.getUsername());
        JOptionPane.showMessageDialog(null, "Password: " + smartphone.getPassword());

        String inputUsername = JOptionPane.showInputDialog("Enter username to validate:");
        String inputPassword = JOptionPane.showInputDialog("Enter password to validate:");

        if (smartphone.validateCredentials(inputUsername, inputPassword)) {
            JOptionPane.showMessageDialog(null, "Credentials are valid");
        } else {
            JOptionPane.showMessageDialog(null, "Credentials are invalid");
        }
    }
}
