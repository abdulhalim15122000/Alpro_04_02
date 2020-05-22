package ch04;

public class M {
    public static void main(String[] args) {
     
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int hasil;
        int hasil1;
        int hasil2;
        int totalhasil;

        for (int i = 0; i < x.length ; i++){
            System.out.print(x[i]+ ",");
        }
        
		System.out.println();
        System.out.println("Angka selisih pada poin I: ");
        hasil = x[0] - x[1];
        System.out.println(hasil);
        
		hasil1 = x[7] - x[8];
        System.out.println(hasil1);
        
		hasil2 = x[10] - x[11];
        System.out.println(hasil2);
        System.out.println();
        
		totalhasil = hasil + hasil1 + hasil2;
        System.out.println("Jumlah angka selisih: " + totalhasil);

	}
        
}

