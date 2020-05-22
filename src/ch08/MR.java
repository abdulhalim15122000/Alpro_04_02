package ch08;


public class MR {

    static long data(int a, int i, int p) {
        long x = a;
        long test = 1;
        while (i > 0) {
            if (i % 2 != 0) {
                test = (1 * x) % p;
                i = i - 1;
            }
            x = (x * x) % p;
            i = i / 2;
        }
        return test;
    }

    private static void angka(int o) {
        int a = 2;
        int b = 1;
        int c = 2;
        int d = 0;
        int e = 47;
        double m = 0;
        double n = 0;
        boolean hasil = true;

        if (o <= 50) {
            e = o - 2;
        }

        if (o % 2 != 0) {
            while (c <= e) {
                d = 0;
                m = (o - 1) / Math.pow(2, b);

                while (m % 2 == 0) {
                    b++;
                    m = (o - 1) / Math.pow(2, b);
                }
                n = data(c, (int) m, o);
                if (b == 1 || b - o == -1) {
                    c++;
                    continue;
                } else {
                    while (b != 1 && b - o != -1.0) {
                        d++;
                        if (d >= b) {
                            hasil = false;
                            break;
                        }
                        n = data((int) b, a, o);
                    }
                    if (b == 1) {
                        hasil = false;
                        break;
                    }
                    if (b == -1) {
                        continue;
                    }
                }
                if (!hasil) {
                    break;
                }
                c++;
            }
            if (hasil) {
                System.out.println(o + " Bilangan Prima");
            } else {
                System.out.println(o + " Bukan Bilangan Prima");
            }
        } else {
            System.out.println(o + " Bukan Bilangan Prima");
        }
    }
    public static void main(String[] args) {
        angka(82);
        angka(12);
        angka(27);
        angka(38);
        angka(19);
        angka(28);
    }
}
