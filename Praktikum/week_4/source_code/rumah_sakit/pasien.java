package source_code.rumah_sakit;

import java.time.LocalDate;
import java.util.ArrayList;

public class pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<konsultasi> riwayatKonsultasi;

    public pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<konsultasi>();
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis     : " + this.noRekamMedis + "\n";
        info += "Nama               : " + this.nama + "\n";
        info += "\n";

        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";

            for (konsultasi konsultasi09 : riwayatKonsultasi) {
                info += konsultasi09.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }

        info += "\n";

        return info;
    }

    public void tambahKonsultasi(LocalDate tanggal, pegawai dokter, pegawai perawat) {
        konsultasi konsultasi09 = new konsultasi();
        konsultasi09.setTanggal(tanggal);
        konsultasi09.setDokter(dokter);
        konsultasi09.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi09);
    }
}
