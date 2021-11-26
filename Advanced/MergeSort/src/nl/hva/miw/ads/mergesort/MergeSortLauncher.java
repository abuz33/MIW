package nl.hva.miw.ads.mergesort;

public class MergeSortLauncher {
    /**
     * A test method
     */
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        MergeSort.mergeSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
