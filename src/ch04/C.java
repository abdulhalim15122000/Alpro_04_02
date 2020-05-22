package ch04;

public class C {

    public static void main(String[] args) {
	int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        System.out.println("Bilangan Ganjil adalah: ");

        for(int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {
                System.out.println(x[i]);
            }
        }
    }
}
