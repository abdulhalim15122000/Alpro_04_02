package ch06;

public class A {

    public static void main(String[] args) {
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Urutan Array menurut algoritma Bubble sort: ");

        for (int i = 0; i < x.length; i++) {
            for (int a = i; a < x.length; a++){

                if(x[i] > x[a]){
                    int b = x[i];
                    x[i] = x[a];
                    x[a] = b;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ",");

        }

    }

}