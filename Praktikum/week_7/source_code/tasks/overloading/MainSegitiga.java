package week_7.source_code.tasks.overloading;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        int totalSudut1 = segitiga.totalSudut(60);
        int totalSudut2 = segitiga.totalSudut(60, 50);

        int keliling1 = segitiga.keliling(3, 4, 5);
        double keliling2 = segitiga.keliling(3, 4);

        System.out.println("Total sudut (1 sudut): " + totalSudut1);
        System.out.println("Total sudut (2 sudut): " + totalSudut2);
        System.out.println("Keliling (3 sisi): " + keliling1);
        System.out.println("Keliling (Pythagoras): " + keliling2);
    }
}
