package week_10.source;

public class Main {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Kipas Angin", 300000, "Putih", "Philips");
        Kulkas kulkas = new Kulkas(2, 4000000, "Silver", "Samsung");
        SmartFridge smartFridge = new SmartFridge(500, 2, 8000000, "Hitam", "LG");
        TV tv = new TV("LED", 15, 5000000, "Hitam", "Sony");

        System.out.println("Info Kipas: " + kipas.getInfo());
        System.out.println("Info Kulkas: " + kulkas.getInfo());
        System.out.println("Info Smart Fridge: " + smartFridge.getInfo());
        System.out.println("Info TV: " + tv.getInfo());
    }
}
