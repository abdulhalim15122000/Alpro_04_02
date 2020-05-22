package ch07;

public class CSS {

    void cocktailSort(int x[])
    {
        boolean hasil = true;
        int awal = 0;
        int akhir = x.length;

        while (hasil == true) {

            hasil = false;

            for (int i = awal; i < akhir - 1; ++i) {
                if (x[i] > x[i + 1]) {
                    int temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                    hasil = true;
                }
            }


            if (hasil == false)
                break;

            hasil = false;
            akhir = akhir - 1;
            for (int i = akhir - 1; i >= awal; i--) {
                if (x[i] > x[i + 1]) {
                    int temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                    hasil = true;
                }
            }

            awal = awal + 1;
        }
    }


    void printArray(int x[])
    {
        int n = x.length;
        for (int i = 0; i < n; i++)
            System.out.print(x[i] + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        CSS ob = new CSS();
        int x[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        ob.cocktailSort(x);
        System.out.println("Coctail Shaker Sort: ");
        ob.printArray(x);
    }
}
