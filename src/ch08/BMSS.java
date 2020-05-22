package ch08;

public class BMSS{

    static int nomor = 123;
    static int data (int x, int y) { return (x > y)? x: y; }
    static void badCharHeuristic( char []huruf, int jumlah,int bch[])
    {

        for (int i = 0; i < nomor; i++)
            bch[i] = -1;


        for (int i = 0; i < jumlah; i++)
            bch[(int) huruf[i]] = i;
    }


    static void search( char abdul[],  char halim[])
    {
        int m = abdul.length;
        int n = halim.length;

        int bch[] = new int[nomor];


        badCharHeuristic(halim, n, bch);

        int o = 0;
        while(o <= (m - n))
        {
            int j = n-1;


            while(j >= 0 && halim[j] == abdul[o+j])
                j--;

            if (j < 0)
            {
                System.out.println("terdapat " + o + " huruf yg cocok");

                o += (o+n < m)? m-bch[abdul[o+n]] : 1;

            }

            else

                o += data(1, j - bch[abdul[o+j]]);

        }
    }

    public static void main(String []args) {

        char abdul[] = "abdulhalim".toCharArray();
        char halim[] = "halim".toCharArray();
        search(abdul, halim);
    }
}