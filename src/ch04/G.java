package ch04;

public class G {

    public static void main(String[] args) {
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};


        System.out.println("Angka kelipatan 5 yang sebelumnya juga kelipatan 5 adalah: ");

        for (int i = 0; i < x.length; i++) {
            if(x[i] % 5 == 0){
                if(x[i - 1] % 5 == 0)
                    System.out.println(x[i] + " ");

            }

        }
        System.out.println();
    }
}