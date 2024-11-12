// package week_8_UTS.question_2;

public class LandVehicle extends Vehicle {
    private int numWheels;

    public LandVehicle(String make, String model, int year, int numWheels) {
        super(make, model, year);
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void drive() {
        System.out.println("Driving the " + getMake() + " " + getModel() + " on " + numWheels + " wheels");
    }
}
