package ch03;

import java.util.Scanner;


public class MenentukanNilaiTertinggidariXYdanZ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan bilangan X: " );
        int x = sc.nextInt();

        System.out.println("masukkan bilangan Y: " );
        int y = sc.nextInt();

        System.out.println("masukkan bilang Z: " );
        int z = sc.nextInt();

        if (x > y && y > z){
            System.out.println("X = " + x + ", adalah nilai tertinggi");
        }
        else if (x < y && y < z){
            System.out.println("Z = " + z + ", adalah nilai tertinggi");
        }
        else{
            System.out.println("Y = " + y + ", adalah nilai tertinggi");
        }


    }
}
