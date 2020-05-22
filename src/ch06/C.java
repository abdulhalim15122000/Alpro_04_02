package ch06;

public class C {

    public static void main(String[] args) {
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Urutan Array menurut Selection sort: ");

        for (int i = 0; i < x.length; i++) {
            int a = i;

            for (int b = i; b < x.length; b++){
                if(x[b] < x[a]){
                    a = b;
                }
            }
            int c = x[i];
            x[i] = x[a];
            x[a] = c;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ",");

        }

    }

}