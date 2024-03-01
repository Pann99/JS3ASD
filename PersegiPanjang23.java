public class PersegiPanjang23 {
    public int panjang;
    public int lebar;

    public PersegiPanjang23(int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    public PersegiPanjang23()
    {

    }
    public void cetakInfo(PersegiPanjang23[] arrayOfPersegiPanjang23)
    {
        for (int i = 0; i < arrayOfPersegiPanjang23.length ; i++) {
            int luas = hitungLuas(arrayOfPersegiPanjang23[i].panjang, arrayOfPersegiPanjang23[i].lebar);
            int keliling = hitungKeliling(arrayOfPersegiPanjang23[i].panjang, arrayOfPersegiPanjang23[i].lebar);
            System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: "
            + arrayOfPersegiPanjang23[i].panjang + ", lebar: " + arrayOfPersegiPanjang23[i]. lebar+", luas: "+ luas+ ", keliling: "+keliling );
        }
    }

    public int hitungLuas(int p, int l)
    {
        int luas = 0;
        luas = p * l;
        return luas;
    }
    public int hitungKeliling(int p, int l)
    {
        int keliling = 0;
        keliling = 2*(p+l);
        return keliling;
    }
}