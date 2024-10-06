package week_6.source_code.ASSIGNMENT.CHILD;

import week_6.source_code.ASSIGNMENT.PARENTS.Employee;

public class Lecturer extends Employee {
    private String NIP;
    private String subject;

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIP: " + NIP);
        System.out.println("Subject: " + subject);
    }
}
