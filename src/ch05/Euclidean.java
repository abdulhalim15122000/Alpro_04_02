package ch05;
import java.util.Scanner;

public class Euclidean {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Bilangan X: ");
        int x = sc.nextInt();
        System.out.println("Masukkan Bilangan Y: ");
        int y = sc.nextInt();

        int z = x % y;
        while(z != 0){
            x = y;
            y = z;
            z = x % y;
        }
        System.out.println("Bilangan Euclideannnya adalah: " + y);
    }
}