package ch08;
import java.util.Scanner;

public class LCSP {

    static void printLCSP(String a, String b, int m, int n)
    {
        int[][] x = new int[m + 1][n + 1];
        int abdul = 0;
        int halim = 0;
        int abdulhalim = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    x[i][j] = 0;

                else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    x[i][j] = x[i - 1][j - 1] + 1;
                    if (abdul < x[i][j]) {
                        abdul = x[i][j];
                        halim = i;
                        abdulhalim = j;
                    }
                }
                else
                    x[i][j] = 0;
            }
        }

        if (abdul == 0) {
            System.out.println("SILAHKAN COBA LAGI!!!");
            return;
        }


        String resultStr = "";


        while (x[halim][abdulhalim] != 0) {
            resultStr = a.charAt(halim - 1) + resultStr;
            --abdul;

            halim--;
            abdulhalim--;
        }


        System.out.println(resultStr);
    }


    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kata/kalimat pertama: ");
        String a = sc.nextLine();
        System.out.println("Masukkan kata/kalimat kedua: ");
        String b = sc.nextLine();

        int m = a.length();
        int n = b.length();

        printLCSP(a, b, m, n);
    }
}
