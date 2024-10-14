package week_8_UTS.question_3;

public class User09 {
    public boolean logIn(int userId, String password) {
        System.out.println("User  logged in with ID: " + userId);
        return true;
    }

    public void recoverPassword() {
        System.out.println("Password recovery initiated.");
    }

    public void logOut() {
        System.out.println("User  logged out.");
    }
}