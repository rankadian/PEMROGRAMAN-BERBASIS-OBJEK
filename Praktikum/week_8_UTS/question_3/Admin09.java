package week_8_UTS.question_3;

public class Admin09 extends User09 {
    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Vehicle details updated for Vehicle ID: " + vehicleId);
    }

    public void addVehicle() {
        System.out.println("New vehicle added.");
    }

    public void retrieveComplain() {
        System.out.println("Retrieving user complaints.");
    }

    public void verifyUser(Customer09 customer) {
        if (customer.getVerificationStatus()) {
            System.out.println("Customer verified.");
        } else {
            System.out.println("Customer not verified.");
        }
    }
}