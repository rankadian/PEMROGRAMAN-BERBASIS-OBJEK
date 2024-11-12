// package week_8_UTS.question_2;

public class Car extends LandVehicle {
    private int numDoors;
    private boolean isElectric;

    public Car(String make, String model, int year, int numWheels, int numDoors, boolean isElectric) {
        super(make, model, year, numWheels);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void accelerate() {
        System.out.println("Accelerating the " + getMake() + " " + getModel());
    }

    public void brake() {
        System.out.println("Braking the " + getMake() + " " + getModel());
    }
}