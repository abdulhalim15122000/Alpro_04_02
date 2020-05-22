package ch05;


public class Kadane {

    public int kadaneForMaxSubArray(int[] x) {
       int max1 = 0;
       int max2 = 0;
       for(int i = 0; i < x.length; i++){
           max1 += x[i];

           if(max1 < 0){
               max1 = 0;
           }
           if (max2 < max1){
               max2 = max1;
           }
       }
       return max2;
    }

    public int kadaneForMaxSubArrayForNegatif(int[] x){
        int max1 = x[0];
        int max2 = x[0];

        for(int i = 1; i < x.length; i++){
            max1 = Math.max(x[i], max1 + x[i]);
            max2 = Math.max(max2, max1);
        }
        return max2;
    }

    public static void main(String[] args) {
        int[] x = {82,12,-41,38,-19,26,9,48};
        Kadane maximum = new Kadane();
        System.out.println("Nilai Maximum pada Array adalah: " + maximum.kadaneForMaxSubArray(x));
        int[] xnegatif = {-38,-19,-8,-26,-7,-10,-3,-12};
        System.out.println("Nilai Maximum pada Array jika semuanya Negatif: " + maximum.kadaneForMaxSubArrayForNegatif(xnegatif));
    }
}