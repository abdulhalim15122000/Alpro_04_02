package ch04;

public class E {

    public static void main(String[] args) {
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        String cari = "2";

        System.out.println("Angka yang mempunyai angka 2 adalah: ");

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 10 == 2 || x[i] / 10 == 2) {
                System.out.println(x[i] + " ");

            }

        }
        System.out.println();
    }
}