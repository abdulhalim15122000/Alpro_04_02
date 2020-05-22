package ch05;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class LIS {
    public static void main(String[] args) throws FileNotFoundException {
        int x [] = {0,1,2,12,4,10,6,14,7,9,13,3,16,17};

		System.out.println("Urutan LIS: " + lis2(x));
	}

    private static int lis2(int[] x) {
        List<Integer> lis2 = new ArrayList<>();
        lis2.add(x[0]);
        for (int i = 1; i < x.length; i++)
            if (x[i] > lis2.get(lis2.size() - 1))
                lis2.add(x[i]);
            else if (x[i] < lis2.get(0))
                lis2.set(0, x[i]);
            else
                lis2.set(binarySearch(lis2, x[i]), x[i]);
        System.out.println("hasil LIS: " + lis2);
        return lis2.size();


    }


    private static int lis3(int[] x) {
        int[] lis3 = new int[x.length];
        int lastIndex = 0;
        lis3[lastIndex] = x[0];
        for (int i = 1; i < x.length; i++)
            if (x[i] > lis3[lastIndex])
                lis3[++lastIndex] = x[i];
            else if (x[i] < lis3[0])
                lis3[0] = x[i];
            else
                lis3[binarySearch(lis3, 0, lastIndex, x[i])] = x[i];
        return lastIndex + 1;
    }


    private static int lis(int[] arr) {
        int max = -1;
        int[] lis = new int[arr.length];
        lis[0] = 1;
        for (int i = 1; i < arr.length; i++)
            for (int a = 0; a < i; a++)
                if (arr[i] > arr[a] && lis[i] < lis[a] + 1) {
                    lis[i] = lis[a] + 1;
                    max = Math.max(max, lis[i]);
                }
        return max;
    }

    private static int binarySearch(int[] a, int abdul, int halim, int key) {
        while (abdul <= halim) {
            int me = (abdul + halim) >>> 1;
            int mid = a[me];
            if (mid < key)
                abdul = me + 1;
            else if (mid > key)
                halim = me - 1;
            else
                return me;
        }
        return abdul;
    }

    private static int binarySearch(List<Integer> a, int key) {
        int abdul = 0;
        int halim = a.size() - 1;
        while (abdul <= halim) {
            int me = (abdul + halim) >>> 1;
            int mid = a.get(me);
            if (mid < key)
                abdul = me + 1;
            else if (mid > key)
                halim = me - 1;
            else
                return me;
        }
        return abdul;
    }
}