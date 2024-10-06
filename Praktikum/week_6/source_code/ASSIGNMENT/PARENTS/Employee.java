package week_6.source_code.ASSIGNMENT.PARENTS;

public class Employee {
    protected String name;
    protected String position;
    protected String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Age: " + age);
    }
}
