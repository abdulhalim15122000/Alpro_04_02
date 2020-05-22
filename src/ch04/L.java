package ch04;

public class L {
    public static void main(String[] args) {
     
        int [] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int hasil = 0;

        System.out.println("Angka dengan angka setelahnya yang hasil penjumlahannya adalah bilangan genap: ");

        for (int i = 0; i < x.length-1; i++){
			hasil = x[i] + x[i + 1];
            if (hasil % 2 == 0) {
   				System.out.println("Angka " + x[i] + " Dan " + x[i+1] + " hasilnya adalah: " + hasil);
				System.out.println();
                
                
            }

		}
        
	}
        
}