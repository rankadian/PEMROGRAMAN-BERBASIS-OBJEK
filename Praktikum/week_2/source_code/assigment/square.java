package assigment;

public class square {
    public int lenght;
    public int wide;

    public int getArea() {
        return lenght * wide;
    }

    public int circumference() {
        return 2 * (lenght + wide);
    }

    public void displayInfo() {
        System.out.println("Square Lenght        : " + lenght + " cm");
        System.out.println("Square Wide          : " + wide + " cm");
        System.out.println("Square Area          : " + getArea() + " cm^2");
        System.out.println("Square Circumference : " + circumference() + " cm");
    }
}
