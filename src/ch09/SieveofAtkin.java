package ch09;
import java.util.Scanner;

public class SieveofAtkin {

    public static void x(int limit) {

        if (limit > 2)
            System.out.print(2 + " ");
        if (limit > 3)
            System.out.print(3 + " ");
        boolean[] hasil = new boolean[limit];

        for (int i = 0; i < limit; i++)
            hasil[i] = false;

        for (int j = 1; j * j < limit; j++) {
            for (int k = 1; k * k < limit; k++) {


                int l = (4 * j * j) + (k * k);
                if (l <= limit && (l % 12 == 1 || l % 12 == 5))

                    hasil[l] ^= true;

                l = (3 * j * j) + (k * k);
                if (l <= limit && l % 12 == 7)
                    hasil[l] ^= true;

                l = (3 * j * j) - (k * k);
                if (j > k && l <= limit && l % 12 == 11)
                    hasil[l] = true;
            }
        }


        for (int m = 5; m * m < limit; m++) {
            if (hasil[m]) {
                for (int n = m * m; n < limit; n += m * m)
                     
                    hasil[n] = false;
            }
        }


        for (int o = 5; o < limit; o++)
            if (hasil[o])
                System.out.print(o + " ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit;
        System.out.println("Masukkan Batas bilangan prima: ");
        limit =sc.nextInt();

        x(limit);
    }
}
