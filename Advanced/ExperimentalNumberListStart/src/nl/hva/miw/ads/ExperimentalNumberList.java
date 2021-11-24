package nl.hva.miw.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExperimentalNumberList {
    private int[] numberList;
    private int numberOfElements;
    private int minimumValue;
    private int maximumValue;


    public ExperimentalNumberList(int numberOfElements) {
        super();
        this.numberOfElements = numberOfElements;
        this.numberList = new int[numberOfElements];
    }

    public ExperimentalNumberList(int[] numberList) {
        this.numberList = numberList;
        this.numberOfElements = numberList.length;
        minimumValue = findMin(numberList);
        maximumValue = findMax(numberList);
    }

    /**
     * Generate random numbers from min to max.
     *
     * @param min
     * @param max
     */
    public void generateNumbers(int min, int max) {
        this.minimumValue = min;
        this.maximumValue = max;
        // de range van de random nummer is max - min + 1 (van 17 tot 41 zijn 25 getallen)
        for (int i = 0; i < numberOfElements; i++) {
            this.numberList[i] = (int) (min + Math.random() * (max - min + 1));
        }
    }

    /**
     * Check if equal values exist in the array.
     *
     * @return
     */
    public boolean equalValuesExist() {
        // Fill in your answer.
        Arrays.sort(numberList);
        for (int i = 0; i < this.numberOfElements - 1; i++) {
            if (numberList[i] == numberList[i + 1]) return true;
        }
        return false;
    }

    /**
     * Count nr of positive values in the array.
     *
     * @return
     */
    public int countPositives() {
        // Fill in your answer
        int count = 0;
        for (int i : numberList) {
            if (i > 0) count++;
        }
        return count;
    }

    /**
     * Sum all positive values in the array
     *
     * @return
     */
    public int sumOfPositives() {
        // Fill in your answer
        int count = 0;
        for (int i : numberList) {
            if (i > 0) count += i;
        }
        return count;
    }

    /**
     * Find the max value.
     *
     * @return
     */
    public int maxValue() {
        // Fill in your answer
        return this.maximumValue;
    }

    /**
     * Count number of different values
     *
     * @return
     */
    public int numberOfDifferentValues() {
        // Fill in your answer
        int count = numberOfElements;
        int[] numberList2 = numberList.clone();
        Arrays.sort(numberList2);
        for (int i = 0; i < this.numberOfElements - 1; i++) {
            if (numberList2[i] == numberList2[i + 1]) count--;
        }
        return count;
    }

    public int numberOfDifferentValuesVersion2() {
        // Fill in your answer
        return 0;
    }

    /**
     * Check if number at index i is a local maximum. That is if it
     * is bigger than all the values earlier in the array.
     *
     * @param i
     * @return
     */
    public boolean isLocalMaximum(int i) {
        // Fill in your answer
        for (int j = 0; j < i; j++) {
            if (numberList[i] < numberList[j]) return false;
        }
        return true;
    }


    /**
     * Return an array of indexes, indicating local maximums. (see method {@link #isLocalMaximum(int)}
     *
     * @return
     */
    public Integer[] locationOfLocalMaximum() {
        // Fill in your answer
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            if (isLocalMaximum(i)) {
                idx.add(i);
            }
        }
        return idx.toArray(new Integer[idx.size()]);
    }

    /**
     * Returns how many local maximums are in the array. (see {@link #isLocalMaximum(int)}
     *
     * @return
     */
    public int numberOfLocalMaximum() {
        // Fill in your answer
        Integer[] localMaxIdx = this.locationOfLocalMaximum();
        return localMaxIdx.length;
    }


    public int getValueAtIndex(int i) {
        return this.numberList[i];
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }


    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    /**
     * Helper functions.
     */

    private int findMax(int[] numberList) {
        int max = Integer.MIN_VALUE;
        for (int i : numberList) {
            if (i > max) max = i;
        }
        return max;
    }

    private int findMin(int[] numberList) {
        int min = Integer.MAX_VALUE;
        for (int i : numberList) {
            if (i < min) min = i;
        }
        return min;
    }

    public String toString() {
        return Arrays.toString(this.numberList);
    }
}
