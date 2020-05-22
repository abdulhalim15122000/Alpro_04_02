package ch07;

public class BlockSort {
    private BlockSort(int[] x) {
        int a = x.length;
        for (int c = 1; c < a; c++) {
            int b = x[c];
            int i = c - 1;
            while ((i >- 1) && (x[i] > b)){
                x[i+1] = x[i];
                i--;
            }
            x[i + 1] = b;
        }
    }
    private int[] x;
    public static void main(String[] args) {
        int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};


        System.out.println("Urutan awal: ");
        for (int i:x){
            System.out.print(i+" ");
        }
        System.out.println();
        new BlockSort(x);

        System.out.println("Diurutkan dengan Block Sort: ");
        for(int i:x){
            System.out.print(i+" ");
        }
    }
}