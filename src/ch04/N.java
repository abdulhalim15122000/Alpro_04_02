package ch04;

public class N {

    public static void main(String[] args) {
        int [] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int hasil = 0;



        for (int i = 0; i < x.length; i++){
            System.out.print("Hasil jumlah " + x[i] + " dengan angka-angka sebelumnya: ");

            System.out.println(x[i] + hasil);
            hasil = hasil + x[i];


        }

    }

}