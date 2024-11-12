// package week_8_UTS.question_1;

public class Main09 {
    public static void main(String[] args) {
        Address09 address = new Address09("Mt. Hariyono", "Malang", "ID", "62701",
                "INDONESIA");
        address.validate();
        System.out.println("Alamat: " + address.outputAsLabel());

        Student09 student = new Student09("Abdul", "089372456748", "abdul@gmail.com",
                12345, 75.5);
        student.setAddress(address);

        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("-".repeat(30));
        System.out.println("Nama: " + student.getName());
        System.out.println("Nomor Mahasiswa: " + student.getStudentNumber());
        System.out.println("Nomor Telepon: " + student.getPhoneNumber());
        System.out.println("Alamat Email: " + student.getEmailAddress());
        System.out.println("Apakah mahasiswa layak mendaftar? " +
                student.isEligibleToEnroll());
        System.out.println("Seminars yang diambil: " + student.getSeminarTaken());

        Professor09 professor = new Professor09("Dr. Romi", "0898776576895",
                "romi@gmail.com", 85000);
        professor.setAddress(address);

        System.out.println("\nInformasi Dosen:");
        System.out.println("-".repeat(30));
        System.out.println("Nama: " + professor.getName());
        System.out.println("Nomor Telepon: " + professor.getPhoneNumber());
        System.out.println("Alamat Email: " + professor.getEmailAddress());
        System.out.println("Gaji: " + professor.getSalary());

        student.purchaseParkingPass();
        professor.purchaseParkingPass();
    }
}