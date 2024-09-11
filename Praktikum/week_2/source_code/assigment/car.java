package assigment;

public class car {
    public String brand;
    public String model;
    public String color;
    public boolean engineStatus; // true = on, false = off
    public double speed; // which is sought by using the top speed test
    public int distance; // meter (a distance of 10km was taken for testing)
    public int time; // seconds

    public double topSpeed(int distance, int time) {
        if (time != 0) {
            speed = distance / time;
            System.out.println("Top Speed : " + speed + " km/h");
        } else {
            System.out.println("Time cannot be zero!");
        }
        return speed;
    }

    public boolean engineStatus(boolean engineStatus) {
        if (engineStatus == true) {
            System.out.println("Engine    : On");
        } else {
            System.out.println("Engine    : Off");
        }
        return engineStatus;
    }

    public void carInfo() {
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Model : " + model);
        System.out.println("Car Color : " + color);
        // System.out.println("Top Speed : " + topSpeed(distance, time) + "km/hour)");
    }
}
