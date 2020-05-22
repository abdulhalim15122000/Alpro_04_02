package ch04;

public class B {

    public static void main(String[] args) {
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int cari = 26;
        for (int i = 0; i < x.length; i++){
            if(x[i] == cari ){
                System.out.println("Angka " + cari + " ditemukan di indeks " + i);
            }

        }
    }
}