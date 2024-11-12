// package week_8_UTS.question_2;

public class Boat extends WaterVehicle {
    private String propulsionType;

    public Boat(String make, String model, int year, float displacement, String propulsionType) {
        super(make, model, year, displacement);
        this.propulsionType = propulsionType;
    }

    public String getPropulsionType() {
        return propulsionType;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    public void anchor() {
        System.out.println("Anchoring the " + getMake() + " " + getModel());
    }
}