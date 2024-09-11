package assigment;

public class carDemo {
    public static void main(String[] args) {
        car c = new car();
        c.brand = "Toyota";
        c.model = "Toyota Camry";
        c.color = "Black Metallic";

        c.engineStatus(true);
        c.topSpeed(1000, 30);
        c.carInfo();

        System.out.println();

        c.brand = "Honda";
        c.model = "Honda Civic";
        c.color = "White Pearl";

        c.engineStatus(false);
        c.topSpeed(1000, 28);
        c.carInfo();
    }
}
