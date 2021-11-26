package nl.hva.miw.ads;

import nl.hva.miw.ads.ExperimentalNumberList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExperimentalNumberListTest {

    private int[] testRijDubbeleWaarde = {-12, 5, 0, -34, 8, 16, 25, 8, -4};
    private int[] testRijGeenDubbele = {-34, 6, 23, 1, 15, -3};

    @Test
    public void testDubbeleWaardeTrue() {
        ExperimentalNumberList testList = new ExperimentalNumberList(testRijDubbeleWaarde);
        assertTrue(testList.equalValuesExist());
    }

    @Test
    public void testDubbelWaardeFalse() {
        ExperimentalNumberList testList = new ExperimentalNumberList(testRijGeenDubbele);
        assertFalse(testList.equalValuesExist());
    }

    @Test
    public void testCountPositives() {
        ExperimentalNumberList testList = new ExperimentalNumberList(testRijDubbeleWaarde);
        assertEquals(5, testList.countPositives());
    }

    @Test
    public void testLocationOfMaxPositie() {
        ExperimentalNumberList testList = new ExperimentalNumberList(testRijDubbeleWaarde);
        int[] VALID_POS = {0, 1, 4, 5, 6};
        assertArrayEquals(VALID_POS, testList.locationOfLocalMaximum());

        ExperimentalNumberList testList2 = new ExperimentalNumberList(testRijGeenDubbele);
        int[] VALID_POS2 = {0, 1, 2};
        assertArrayEquals(VALID_POS2, testList2.locationOfLocalMaximum());
    }
}
