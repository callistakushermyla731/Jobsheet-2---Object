public class dosenMain04 {
    public static void main(String[] args) {
        
        dosen04 dsn1 = new dosen04();
        dsn1.idDosen = "D001";
        dsn1.nama = "Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Pemrograman";

        dosen04 dsn2 = new dosen04(
            "D0002",
            "Siti Rahma",
            true,
            2018,
            "Basis Data"
        );

        dsn1.tampilInformasi();
        dsn2.tampilInformasi();

        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Kecerdasan Buatan");

        int masaKerja = dsn1.hitungMasaKerja(2024);
        System.out.println("Masa kerja " + dsn1.nama + " adalah " + masaKerja + " tahun");

        dsn1.tampilInformasi();
    }
}
 