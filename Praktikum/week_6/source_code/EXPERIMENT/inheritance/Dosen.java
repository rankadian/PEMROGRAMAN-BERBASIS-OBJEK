package week_6.source_code.EXPERIMENT.inheritance;

import week_6.source_code.EXPERIMENT.testpackage.Pegawai;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    // EXPERIMENT 4 1
    // public String getAllInfo() {
    // String info = "";
    // info += "NIP : " + nip + "\n";
    // info += "Nama : " + nama + "\n";
    // info += "Gaji : " + gaji + "\n";
    // info += "NIDN : " + nidn + "\n";

    // return info;
    // }

    // EXPERIMENT 4 2
    // public String getAllInfo() {
    // String info = "";
    // info += "NIP : " + this.nip + "\n";
    // info += "Nama : " + this.nama + "\n";
    // info += "Gaji : " + this.gaji + "\n";
    // info += "NIDN : " + this.nidn + "\n";

    // return info;
    // }

    // EXPERIMENT 4 3
    // public String getAllInfo() {
    // String info = "";
    // info += "NIP : " + super.nip + "\n";
    // info += "Nama : " + super.nama + "\n";
    // info += "Gaji : " + super.gaji + "\n";
    // info += "NIDN : " + super.nidn + "\n";

    // return info;
    // }

    // EXPERIMENT 4 4
    // public String getAllInfo() {
    // String info = "";
    // info += "NIP : " + super.nip + "\n";
    // info += "Nama : " + super.nama + "\n";
    // info += "Gaji : " + super.gaji + "\n";
    // info += "NIDN : " + this.nidn + "\n";

    // return info;
    // }

    // EXPERIMENT 5 1
    // public String getAllInfo() {
    // String info = getInfo();
    // info += "NIDN : " + nidn;

    // return info;
    // }

    // EXPERIMENT 5 2
    // public String getAllInfo() {
    // String info = this.getInfo();
    // info += "NIDN : " + nidn;

    // return info;
    // }

    // EXPERIMENT 5 3
    // public String getAllInfo() {
    // String info = super.getInfo();
    // info += "NIDN : " + nidn;

    // return info;
    // }

    // EXPERIMENT 5 4
    public String getInfo() {
        return "NIDN   : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }

    // EXPERIMENT 6
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    // System.out.println("Objek dari class Dosen dibuat dari constructor
    // berparameter");
    // }

    // EXPERIMENT 7 1
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    // this.nip = nip;
    // this.nama = nama;
    // this.gaji = gaji;
    // this.nidn = nidn;
    // }

    // EXPERIMENT 7 2
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    // super.nip = nip;
    // super.nama = nama;
    // super.gaji = gaji;
    // this.nidn = nidn;
    // }

    // EXPERIMENT 7 3
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    // super();
    // super.nip = nip;
    // super.nama = nama;
    // super.gaji = gaji;
    // this.nidn = nidn;
    // }

    // EXPERIMENT 7 5
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    // this.nidn = nidn;
    // super(nip, nama, gaji);
    // }

    // EXPERIMENT 7 5
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    // super(nip, nama, gaji);
    // this.nidn = nidn;
    // }
}