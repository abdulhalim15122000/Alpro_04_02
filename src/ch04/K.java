package ch04;

public class K {
    public static void main(String[] args) {
     
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};
     
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i]+ ",");
        }   
        System.out.println();
        System.out.println("Angka yang setelahnya lebih besar adalah: ");
        System.out.println(x[1] + " setelahnya " + x[2]);
        System.out.println(x[4] + " setelahnya " + x[5]);
        System.out.println(x[6] + " setelahnya " + x[7]);
        System.out.println(x[8] + " setelahnya " + x[9]);
        System.out.println(x[10] + " setelahnya " + x[11]);
     
	}
}

