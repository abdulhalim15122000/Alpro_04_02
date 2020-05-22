package ch04;

public class J {
    public static void main(String[] args) {
     
        int[] x={82,12,41,38,19,26,9,48,20,55,8,32,3};
		int hasil;
		int hasil1;
		int hasil2;
     
        for (int i = 0; i < x.length -1; i++){
            System.out.print(x[i]+ ",");
        }   
        
		System.out.println();
        System.out.println("selisih angka pertama, 82 dan 12");
        hasil = x[0] - x[1];
        System.out.println(hasil);
		System.out.println();
        
		System.out.println("selisih angka kedua, 48 dan 20");
        hasil1 = x[7] - x[8];
        System.out.println(hasil1);
		System.out.println();
        
		System.out.println("selisih angka ketiga, 8 dan 32");
        hasil2 = x[10] - x[11];
        System.out.println(hasil2);
        
     
	}
        
}
