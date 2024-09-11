package jobsheet3;

public class motorDemo {
    public static void main(String[] args) {
        motor motor1 = new motor();
        motor1.displayStatus();

        motor1.platNomor = "B 0838 XZ";
        int kecepatanBaru = 50;
        if (!motor1.isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecepatanBaru;
        }
        motor1.displayStatus();

        motor motor2 = new motor();
        motor2.platNomor = "N 9840 AE";
        motor2.isMesinOn = true;
        kecepatanBaru = 40;
        if (!motor2.isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor2.kecepatan = kecepatanBaru;
        }
        motor2.displayStatus();

        motor motor3 = new motor();
        motor3.platNomor = "D 8343 CV";
        kecepatanBaru = 60;
        if (!motor3.isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor3.kecepatan = kecepatanBaru;
        }
        motor3.displayStatus();
    }
}
