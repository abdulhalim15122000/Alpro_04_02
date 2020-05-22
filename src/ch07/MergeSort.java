package ch07;

class MergeSort {

    private int[] x = {82,12,41,38,19,26,9,48,20,55,8,32,3};


    private void printData() {
        StringBuilder out = new StringBuilder("Bilangan Array: ");
        for (int datum : this.x) {
            out.append(datum).append(", ");
        }
        System.out.println(out);
    }

    private void Sort() {
        int m = 0;
        int n = this.x.length -1;

        ms(m,n);
    }

    private void ms(int awal, int akhir) {
        int o = (akhir - awal + 1);

        if (o > 1) {
            int tengah = (awal + akhir) / 2;

            ms(awal, tengah);
            ms(tengah + 1, akhir);

            int[] temp = new int[o];
            int a = awal;
            int b = tengah + 1;

            for (int i = 0; i < o; i++) {
                if (a <= tengah && b <= akhir) {
                    if (this.x[a] < this.x[b]) {
                        temp[i] = this.x[a];
                        a++;
                    } else {
                        temp[i] = this.x[b];
                        b++;
                    }
                } else  if (a <= tengah) {
                    temp[i] = this.x[a];
                    a++;
                } else {
                    temp[i] = this.x[b];
                    b++;
                }
            }

            System.arraycopy(temp, 0, this.x, awal, o);
        }
    }

    public static void main(String[] args) {
        MergeSort halim = new MergeSort();
        halim.printData();
        halim.Sort();
        halim.printData();
    }
}
