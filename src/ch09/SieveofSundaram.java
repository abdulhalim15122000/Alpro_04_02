package ch09;
import java.util.Arrays;
import java.util.Scanner;

public class SieveofSundaram {
    static int SieveOfSundaram(int x) {

        int a = (x - 2) / 2;
        boolean hasil[] = new boolean[a + 1];
        Arrays.fill(hasil, false);


        for (int i = 1; i <= a; i++)
            for (int j = i; (i + j + 2 * i * j) <= a; j++)
                hasil[i + j + 2 * i * j] = true;

        if (x > 2)
            System.out.print(2 + " ");

        for (int i = 1; i <= a; i++)
            if (hasil[i] == false)
                System.out.print(2 * i + 1 + " ");
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan batas bilangan: ");
        int x = sc.nextInt();
        SieveOfSundaram(x);
    }
}

