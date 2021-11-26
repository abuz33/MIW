package nl.hva.miw.ads.quicksort;

import java.util.Arrays;

public class InsertionSortLauncher {
    public static void main(String[] args) {

        int[] a = new int[] { 3,5,21,4,15,2,17,12,7,9,0,20};

        InsertionSort.insertionSort(a);

        System.out.println("Sorted " + Arrays.toString(a));

    }
}
