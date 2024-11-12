// package week_8_UTS.question_1;

import java.util.List;

public class Student09 extends Person09 {
    private int studentNumber;
    private double averageMark;

    public Student09(String name, String phoneNumber, String emailAddress, int studentNumber, double averageMark) {
        super(name, phoneNumber, emailAddress);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public boolean isEligibleToEnroll() {
        return averageMark >= 60.0;
    }

    public List<String> getSeminarTaken() {
        return List.of("Seminar AI", "Seminar Data Science");
    }
}