public class mataKuliahMain04 {
    public static void main(String[] args) {
        mataKuliah04 mk1 = new mataKuliah04();
        mk1.kodeMK = "MK001";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jmlJam = 6;

        mataKuliah04 mk2 = new mataKuliah04(
            "MK002",
            "Struktur Data",
            4,
            8
        );

        mk1.tampilInformasi();
        mk2.tampilInformasi();

        mk1.ubahSKS((4));
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        mk1.tampilInformasi();
    }
}
