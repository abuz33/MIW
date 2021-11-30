import datastructures.ArrayListHeap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListHeapTest {

    @Test
    public void testAddRemove() {
        ArrayListHeap<Integer> testHeap = new ArrayListHeap<>();
        Integer[] testSet = {4, 23, 9, 11, 6, 18, 3, 10, 19, 5, 8, 22, 13, 12, 7};
        for (Integer integer : testSet) {
            testHeap.addItem(integer);
        }
        Arrays.sort(testSet, Collections.reverseOrder());
        for (Integer integer : testSet) {
            assertEquals(integer, testHeap.removeItem());
        }
    }

}
