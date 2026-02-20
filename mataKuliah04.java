public class mataKuliah04 {
    String kodeMK;
    String nama;
    int  sks;
    int jmlJam;

    public mataKuliah04(){

    }

    public mataKuliah04(String kodeMK, String nama, int  sks, int jmlJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jmlJam = jmlJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " +jmlJam);
    }

    void ubahSKS(int newSKS) {
        sks = newSKS;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jmlJam += jam;
        System.out.println("Jumlah jam berhasil ditambah. Total jam menjadi " + jmlJam);
    }

    void kurangiJam(int jam) {
        jmlJam -= jam;
        if (jmlJam >= jam) {
            jmlJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Total jam menjadi " + jmlJam);
        } else {
            System.out.println("Tidak dapat dilakukan penngurangan jam karena jumlah jam tidak mencukupi.");
        }
    }
}
