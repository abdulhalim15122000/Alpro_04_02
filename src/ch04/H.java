package ch04;

public class H {

    public static void main(String[] args) {
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int jumlah = 0;

        for (int i = 0; i < x.length; i++) {
            jumlah += x[i];
        }
        System.out.println("Jumlah Array adalah: " + jumlah);

    }
}