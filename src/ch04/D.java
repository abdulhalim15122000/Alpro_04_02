package ch04;

public class D {

    public static void main(String[] args) {
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        System.out.println("Angka kelipatan 3 adalah: ");

        for (int i =0; i < x.length; i++){
            if(x[i] % 3 == 0){
                System.out.print(x[i]);
                System.out.println();

            }

        }

    }
}