package week_8_UTS.question_2;

public class Address09 {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public Address09(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public void validate() {
        System.out.println("Validating address: " + street + ", " + city + ", " + country);
    }

    public String outputAsLabel() {
        return street + ", " + city + ", " + state + " " + postalCode + ", " + country;
    }
}