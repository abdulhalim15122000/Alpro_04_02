package ch04;

public class I {

    public static void main(String[] args) {
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int hasil = 0;

        System.out.println("Selisih angka sebelum dan sesudahnya adalah: ");

        for (int i = 0; i < x.length-1; i++) {
            
			if (hasil % 1 == 0) {
                hasil = x[i] - x[i + 1];
            }

            System.out.println("Angka sebelumnya: " + x[i]);
            System.out.println("Angka sesudahnya: " + x[i + 1]);
            System.out.println("Selisih angka adalah: " + hasil);
            System.out.println();

        }
    }
}