package nl.hva.miw.ads.quicksort;

public class QuickSortLauncher {
    /** A test method */
    public static void main(String[] args) {
      int[] list = {2, 3, 2, 18, 29, 234, 67, 15, 6, 9, 22, 45, 5, 6, 1, -2, 3, 14, 12, 11 };
      QuickSort.quickSort(list);
      for (int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");
    }
}
