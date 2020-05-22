package ch03;

import java.util.Scanner;

public class MenentukanBilanganPrima {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        int bil, faktor = 0;

        System.out.println("Masukkan Bilangan: ");
        bil = sc.nextInt();

        for (int i = 1; i <= bil; i++) {
            if (bil % i == 0) {
                faktor++;
            }
        }

        if (faktor == 2) {
            System.out.println(bil + " adalah bilangan prima");
        } else {
            System.out.println(bil + " bukan bilangan prima");
        }
    }
}