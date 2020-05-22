package ch09;
import java.util.Scanner;


public class SieveofErathosenes {


    void sieveOfEratosthenes(int x)
    {

        boolean hasil[] = new boolean[x+1];
        for(int i = 0; i < x; i++)
            hasil[i] = true;

        for(int p = 2; p*p <=x; p++) {

            if(hasil[p] == true)
            {

                for(int i = p*2; i <= x; i += p)
                   hasil[i] = false;
            }
        }


        for(int i = 2; i <= x; i++)
        {
            if(hasil[i] == true)
                System.out.print(i + " ");
        }
    }


    public static void main(String args[])  {

        Scanner sc = new Scanner (System.in);
        System.out.print("masukkan batas bilangan: ");
        int x = sc.nextInt();



        System.out.println("sieve of erathosenes dari " + x);
        SieveofErathosenes abdul = new SieveofErathosenes();
        abdul.sieveOfEratosthenes(x);
    }
}
