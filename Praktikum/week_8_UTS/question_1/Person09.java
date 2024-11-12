// package week_8_UTS.question_1;

public class Person09 {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address09 address;

    public Person09(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void purchaseParkingPass() {
        System.out.println(name + " has purchased a parking pass.");
    }

    public void setAddress(Address09 address) {
        this.address = address;
    }

    public Address09 getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}