package ch03;

import java.util.Scanner;

public class MenentukanNilaiTertinggidariXdanY {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan bilangan X: " );
        int x = sc.nextInt();

        System.out.println("masukkan bilangan Y: " );
        int y = sc.nextInt();

        if (x > y){
            System.out.println("X = " + x + ", adalah nilai tertinggi");
        }else{
            System.out.println("Y = " + y + ", adalah nilai tertinggi");
        }


    }
}
