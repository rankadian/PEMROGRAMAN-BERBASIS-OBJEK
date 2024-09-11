package jobsheet3;

public class motorEnkapsulasiDemo {
    public static void main(String[] args) {
        motorEnkapsulasi motor1 = new motorEnkapsulasi();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        motorEnkapsulasi motor2 = new motorEnkapsulasi();
        motor2.setPlatNomor("N 9840");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(40);
        motor2.displayStatus();

        motorEnkapsulasi motor3 = new motorEnkapsulasi();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();
    }
}
