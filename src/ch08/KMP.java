package ch08;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KMP {

    private int[] x;

    public KMP(String text, String pattern) {
    }

    public void kmp(String text, String pat)
    {

        x = new int[pat.length()];
        fail(pat);

        int kata = posMatch(text, pat);
        if (kata == -1)
            System.out.println("kata tidak ketemu");
        else
            System.out.println("kecocokan ditemukan di indeks = "+ kata);
    }

    private void fail(String pat)
    {
        int a = pat.length();
        x[0] = -1;
        for (int i = 1; i < a; i++)
        {
            int b = x[i - 1];
            while ((pat.charAt(i) != pat.charAt(b + 1)) && b >= 0)
                b = x[b];
            if (pat.charAt(i) == pat.charAt(b + 1))
                x[i] = b + 1;
            else
                x[i] = -1;
        }
    }

    private int posMatch(String text, String pat)
    {
        int y = 0;
        int z = 0;
        int abdul = text.length();
        int halim = pat.length();
        while (y < abdul && z< halim) {
            if (text.charAt(y) == pat.charAt(z)) {
                y++;
                z++;
            }
            else if (z == 0)
                y++;
            else
                z = x[z - 1] + 1;
        }
        return ((z == abdul) ? (y - halim) : -1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Knuth Morris Pratt");
        System.out.println(" Masukkan teks = ");
        String text = br.readLine();
        System.out.println("Masukkan pola= ");
        String pattern = br.readLine();
        KMP kmp = new KMP(text, pattern);
    }
}