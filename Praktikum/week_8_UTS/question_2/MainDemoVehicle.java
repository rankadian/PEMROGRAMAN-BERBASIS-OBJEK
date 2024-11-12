// package week_8_UTS.question_2;

public class MainDemoVehicle {
    public static void main(String[] args) {
        // Demonstrate Car
        System.out.println("=== Car Demo ===");
        Car car = new Car("Tesla", "Model S", 2023, 4, 4, true);
        demonstrateCar(car);

        // Demonstrate Motorcycle
        System.out.println("\n=== Motorcycle Demo ===");
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Sportster", 2023, 2, false);
        demonstrateMotorcycle(motorcycle);

        // Demonstrate Boat
        System.out.println("\n=== Boat Demo ===");
        Boat boat = new Boat("Sea Ray", "Sundancer", 2023, 10000f, "Inboard");
        demonstrateBoat(boat);

        // Demonstrate Submarine
        System.out.println("\n=== Submarine Demo ===");
        Submarine submarine = new Submarine("General Dynamics", "Virginia class", 2023, 7800f, 800);
        demonstrateSubmarine(submarine);
    }

    private static void demonstrateCar(Car car) {
        System.out.println("Car: " + car.getMake() + " " + car.getModel() + " (" + car.getYear() + ")");
        System.out.println("Number of doors: " + car.getNumDoors());
        System.out.println("Is electric: " + car.isElectric());
        car.startEngine();
        car.drive();
        car.accelerate();
        car.brake();
        car.stopEngine();
    }

    private static void demonstrateMotorcycle(Motorcycle motorcycle) {
        System.out.println("Motorcycle: " + motorcycle.getMake() + " " + motorcycle.getModel() + " ("
                + motorcycle.getYear() + ")");
        System.out.println("Has sidecar: " + motorcycle.hasSidecar());
        motorcycle.startEngine();
        motorcycle.drive();
        motorcycle.wheelie();
        motorcycle.stopEngine();
    }

    private static void demonstrateBoat(Boat boat) {
        System.out.println("Boat: " + boat.getMake() + " " + boat.getModel() + " (" + boat.getYear() + ")");
        System.out.println("Displacement: " + boat.getDisplacement() + " tons");
        System.out.println("Propulsion type: " + boat.getPropulsionType());
        boat.startEngine();
        boat.sail();
        boat.anchor();
        boat.stopEngine();
    }

    private static void demonstrateSubmarine(Submarine submarine) {
        System.out.println(
                "Submarine: " + submarine.getMake() + " " + submarine.getModel() + " (" + submarine.getYear() + ")");
        System.out.println("Displacement: " + submarine.getDisplacement() + " tons");
        System.out.println("Maximum depth: " + submarine.getMaxDepth() + " meters");
        submarine.startEngine();
        submarine.sail();
        submarine.submerge();
        submarine.surface();
        submarine.stopEngine();
    }
}