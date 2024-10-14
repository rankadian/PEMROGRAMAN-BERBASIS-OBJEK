package week_8_UTS.question_2;

public class Professor09 extends Person09 {
    private double salary;

    public Professor09(String name, String phoneNumber, String emailAddress, double salary) {
        super(name, phoneNumber, emailAddress);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
}