package ch06;

public class B {

    public static void main(String[] args) {
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Urutan Array menurut Insertion sort: ");

        for (int i = 0; i < x.length; i++) {
            for (int a = i; a >= 1; a--){
                if(x[a] > x[a - 1]){
                    break;
                }
                int b = x[a];
                x[a] = x[a - 1];
                x[a - 1] = b;
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ",");

        }

    }

}