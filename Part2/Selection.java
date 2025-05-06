package Part2;

import java.util.Arrays;

// Part 2: Part2.Selection Sort
public class Selection {
    public static void sort(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {if (less(a[j], a[min])) min = j;}
            exch(a, i, min);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 2, 7, 0, 3, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
