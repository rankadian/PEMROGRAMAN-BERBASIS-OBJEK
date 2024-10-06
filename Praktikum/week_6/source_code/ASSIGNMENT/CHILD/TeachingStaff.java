package week_6.source_code.ASSIGNMENT.CHILD;

import week_6.source_code.ASSIGNMENT.PARENTS.Employee;

public class TeachingStaff extends Employee {
    private String NIP;
    private String part;

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIP: " + NIP);
        System.out.println("Part: " + part);
    }
}
