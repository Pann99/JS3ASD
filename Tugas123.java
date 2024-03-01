public class Tugas123 {
    public double ipk, hitungIpk;
    public String nama, nim, jenisKelamin;
    public Tugas123(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
    public Tugas123()
    {
    }
    public void cetakInfo(Tugas123[] mahasiswa)
    {

        System.out.println("========================");
        int i =1;
        for (Tugas123 mhs : mahasiswa) {
            hitungIpk += mhs.ipk;
            System.out.println("Data Mahasiswa ke-" + i);
            System.out.println("Nama: " + mhs.nama);
            System.out.println("Nim: " + mhs.nim);
            System.out.println("Jenis kelamin: " + mhs.jenisKelamin);
            System.out.println("IPK: " + mhs.ipk);
            System.out.println();
            i++;
        }
        System.out.println("========================");
        System.out.println("Rata-rata IPK : "+ getAvgIpk(hitungIpk, mahasiswa.length));
    }
    public double getAvgIpk(double ipk, int mhs)
    {
        double avg;
        avg = ipk/Double.valueOf(mhs);
        return avg;
    }
}