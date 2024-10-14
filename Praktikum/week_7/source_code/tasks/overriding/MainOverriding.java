package week_7.source_code.tasks.overriding;

public class MainOverriding {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen();
        Manusia manusia2 = new Mahasiswa();

        manusia1.makan();
        manusia2.makan();

        ((Dosen) manusia1).lembur();
        ((Mahasiswa) manusia2).tidur();
    }
}