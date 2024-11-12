// package week_8_UTS.question_2;

public class Submarine extends WaterVehicle {
    private int maxDepth;

    public Submarine(String make, String model, int year, float displacement, int maxDepth) {
        super(make, model, year, displacement);
        this.maxDepth = maxDepth;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public void submerge() {
        System.out.println(
                "Submerging the " + getMake() + " " + getModel() + " to a maximum depth of " + maxDepth + " meters");
    }

    public void surface() {
        System.out.println("Surfacing the " + getMake() + " " + getModel());
    }
}