package week_6.source_code.ASSIGNMENT;

import week_6.source_code.ASSIGNMENT.CHILD.Lecturer;
import week_6.source_code.ASSIGNMENT.CHILD.TeachingStaff;

public class MainDemo {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Dr. John Doe");
        lecturer.setPosition("Professor");
        lecturer.setAge("45");
        lecturer.setNIP("123456789");
        lecturer.setSubject("Computer Science");
        System.out.println("Lecturer Info:");
        lecturer.displayInfo();

        System.out.println();

        TeachingStaff teachingStaff = new TeachingStaff();
        teachingStaff.setName("Mr. Richard Roe");
        teachingStaff.setPosition("Assistant");
        teachingStaff.setAge("30");
        teachingStaff.setNIP("987654321");
        teachingStaff.setPart("Laboratory Technician");
        System.out.println("Teaching Staff Info:");
        teachingStaff.displayInfo();
    }
}
