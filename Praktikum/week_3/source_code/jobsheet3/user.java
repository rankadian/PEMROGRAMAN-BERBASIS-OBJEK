package jobsheet3;

public class user {
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    public user() {

    }

    public user(String username, String nama, String email) {
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    public void cetakInfo() {
        System.out.println("Username: " + username);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("=".repeat(30));
    }
}
