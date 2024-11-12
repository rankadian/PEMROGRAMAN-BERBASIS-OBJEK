// package week_8_UTS.question_2;

public class Motorcycle extends LandVehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, int numWheels, boolean hasSidecar) {
        super(make, model, year, numWheels);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public void wheelie() {
        if (!hasSidecar) {
            System.out.println("Performing a wheelie on the " + getMake() + " " + getModel());
        } else {
            System.out.println("Cannot perform a wheelie with a sidecar on the " + getMake() + " " + getModel());
        }
    }
}