package week_8_UTS.question_3;

public class UserProfile09 {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc;

    public UserProfile09(int userId, String password, String name, int age, String emailId, String doc) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = doc;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return emailId;
    }

    public void editProfile(String newName, int newAge, String newEmail) {
        this.name = newName;
        this.age = newAge;
        this.emailId = newEmail;
        System.out.println("Profile updated successfully.");
    }

    public void showDocuments() {
        System.out.println("Documents: " + doc);
    }

    public String getDoc() {
        return doc;
    }
}