package Part6;

import java.util.Arrays;

// Part 6: Part6.Merge Sort
public class Merge {
    private static Comparable[] aux;

    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi)
    {
        for (int k = lo; k <= hi; k++) {aux[k] = a[k];}

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void main(String[] args)
    {
        Integer[] arr = {5, 2, 7, 0, 3, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
