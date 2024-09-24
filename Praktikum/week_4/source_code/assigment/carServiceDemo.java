package source_code.assigment;

import java.time.LocalDate;

public class carServiceDemo {

    public static void main(String[] args) {
        mechanic adi = new mechanic("001", "Adi");
        mechanic edi = new mechanic("002", "Edi");

        car car1 = new car("N 5435 NAC", "Sumargo");
        car1.addService(LocalDate.of(2024, 8, 4), adi, "Oil change");
        car1.addService(LocalDate.of(2024, 9, 17), edi, "Tire rotation");

        System.out.println(car1.getInfo());

        car car2 = new car("N 7547 ZX", "Nurdi");
        System.out.println(car2.getInfo());
    }
}