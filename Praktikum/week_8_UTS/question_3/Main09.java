package week_8_UTS.question_3;

public class Main09 {
    public static void main(String[] args) {
        UserProfile09 userProfile = new UserProfile09(101, "password101", "Emil", 30, "emil@gmail.com", "profile.jpg");
        System.out.println("User  Profile:");
        System.out.println("-".repeat(30));
        System.out.println("Name: " + userProfile.getName());
        System.out.println("Age: " + userProfile.getAge());
        System.out.println("Email: " + userProfile.getEmail());
        System.out.println("Documents: " + userProfile.getDoc());
        userProfile.showDocuments();
        userProfile.editProfile("Edo", 31, "edo@gmail.com");

        Customer09 customer = new Customer09();
        System.out.println("\nLogin sebagai Customer:");
        System.out.println("-".repeat(30));
        customer.logIn(101, "password101");
        customer.applyVerification("member_card.png");
        System.out.println("Verification Status: " + customer.getVerificationStatus());
        customer.logOut();

        Admin09 admin = new Admin09();
        System.out.println("\nLogin sebagai Admin:");
        System.out.println("-".repeat(30));
        admin.logIn(000, "admin");
        admin.addVehicle();
        admin.updateVehicleDetails(010);
        admin.retrieveComplain();
        admin.verifyUser(customer);
        admin.logOut();
    }
}