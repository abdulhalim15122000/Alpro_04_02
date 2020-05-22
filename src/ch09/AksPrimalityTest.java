package ch09;
import java.util.Scanner;

public class AksPrimalityTest {
    static long a[] = new long[1000];


    static void AksPrimalityTest(int x)
    {
        a[0] = 1;
        for (int i = 0; i < x; a[0] = -a[0], i++) {
            a[1 + i] = 1;

            for (int j = i; j > 0; j--)
                a[j] = a[j - 1] - a[j];
        }
    }

    static boolean Prima(int k)
    {
        AksPrimalityTest(k);
        a[0]++;
        a[k]--;
        int i = k;
        while ((i--) > 0 && a[i] % k == 0);
        return i < 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan bilangan: ");
        int x = sc.nextInt();
        if (Prima(x))
            System.out.println("Bilangan prima");
        else
            System.out.println("Bukan Bilangan prima");
    }
}
