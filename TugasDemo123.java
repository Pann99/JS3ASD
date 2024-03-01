import java.util.Scanner;
public class TugasDemo123 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.print("Masukkan berapa mahasiswa yang ingin di data : ");
        length = sc.nextInt();

        Tugas123[] mahasiswa = new Tugas123[length];
        double ipk;
        String nama, nim, jenisKelamin;

       
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            nama = sc.next();
            System.out.print("Masukkan NIM: ");
            nim = sc.next();
            System.out.print("Masukkan jenis kelamin: ");
            jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            ipk = sc.nextDouble();

            mahasiswa[i] = new Tugas123(nama, nim, jenisKelamin, ipk);
            System.out.println();
        }
        Tugas123 tugas123 = new Tugas123();
        tugas123.cetakInfo(mahasiswa);
        
    }
}