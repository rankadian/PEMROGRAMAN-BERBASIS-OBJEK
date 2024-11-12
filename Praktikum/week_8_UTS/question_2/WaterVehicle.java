// package week_8_UTS.question_2;

public class WaterVehicle extends Vehicle {
    private float displacement;

    public WaterVehicle(String make, String model, int year, float displacement) {
        super(make, model, year);
        this.displacement = displacement;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public void sail() {
        System.out.println("Sailing the " + getMake() + " " + getModel() + " with " + displacement + " displacement");
    }
}