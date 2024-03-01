import java.util.Scanner;

public class PersegiPanjangDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.print("Masukkan berapa banyak anda ingin menghitung : ");
        length = sc.nextInt();

        PersegiPanjang23[] arrayOfPersegiPanjang23 = new PersegiPanjang23[length];
        int panjang, lebar;

        for (int i = 0; i < arrayOfPersegiPanjang23.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang23[i] = new PersegiPanjang23(panjang, lebar);
            
        }
        PersegiPanjang23 persegiPanjang23 = new PersegiPanjang23();
        persegiPanjang23.cetakInfo(arrayOfPersegiPanjang23);
        
    }
}