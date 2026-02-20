public class dosen04 {
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public dosen04() {

    }

    public dosen04(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen         : " + idDosen);
        System.out.println("Nama             : " + nama);
        System.out.println("Status Aktif     : " + statusAktif);
        System.out.println("Bidang Keahlian  : " + bidangKeahlian);
        System.out.println("-----------------------------------");
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status berhasil diubah");
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah.");
    }
}
