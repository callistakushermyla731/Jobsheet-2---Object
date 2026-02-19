Jawaban Percobaan 1
1. - Atribut : data yang dimiliki oleh object atau class. biasanya berupa kata benda
   - Method(fungsi) : proses/tingkah laku yang bisa dilakukan oleh object. biasanya berupa kata kerja
2. Ada 4. nama, nim, kelas, ipk
3. Ada 4. tampilkanInformasi(); ubahKelas(String kelasBaru); updateIPK(double ipkBaru); nilaiKinerja();
4. Modifikasi
5. - Cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa : dengan mengecek nilai IPK menggunakan percabangan if–else. Program akan membandingkan nilai ipk, lalu menentukan kategori kinerja berdasarkan rentang nilai, setelah itu method mereturn teks keterangan kinerja.
   - Kriteria yang digunakan untuk menentukan nilai kinerja tersebut : rentang ipk
   - Yang dikembalikan (di-return-kan) oleh method nilaiKinerja() : mengembalikan nilai bertipe String berupa teks, seperti "Kinerja sangat baik", "Kinerja baik", "Kinerja cukup", "Kinerja kurang"

Jawaban Percobaan 2
1. - Baris kode program yang digunakan untuk proses instansiasi : mahasiswa04 mhs1 = new mahasiswa04();
   - Nama object yang dihasilkan : mhs1
2. Menggunakan namaObjek.namaAtribut atau namaObjek.namaMethod(); contoh :  mhs1.tampilkanInformasi();
3. Pemanggilan pertama menampilkan data awal berupa Kelas: SI 2J IPK: 3.55. Lalu dilakukan perubahan nilai atribut dalam objek mhs1 berubah menjadi Kelas: SI 2K IPK: 3.60. Lalu pemanggilan kedua menampilkan data yang sudah diperbarui
