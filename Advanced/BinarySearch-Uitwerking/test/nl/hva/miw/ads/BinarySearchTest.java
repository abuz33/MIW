package nl.hva.miw.ads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @org.junit.jupiter.api.Test
    void binarysearch() {
        BinarySearch bs = new BinarySearch();

        int[] array = { 1,3,24, 48, 124, 168, 210, 256, 481, 512, 768, 800, 945, 1024};

        int actual = bs.binarysearch( array, 481);
        int expected = 8;
        assertEquals( expected, actual );

        actual = bs.binarysearch( array, 482);
        expected = -1;
        assertEquals( expected, actual );

        actual = bs.binarysearch( array, 1);
        expected = 0;
        assertEquals( expected, actual );

        actual = bs.binarysearch( array, 1024);
        expected = 13;
        assertEquals( expected, actual );
    }

    @Test
    void binarysearchRecursive() {
        BinarySearch bs = new BinarySearch();

        int[] array = { 1,3,24, 48, 124, 168, 210, 256, 481, 512, 768, 800, 945, 1024};

        int actual = bs.binarysearchRecursive( array, 481);
        int expected = 8;
        assertEquals( expected, actual );

        actual = bs.binarysearchRecursive( array, 482);
        expected = -1;
        assertEquals( expected, actual );

        actual = bs.binarysearchRecursive( array, 1);
        expected = 0;
        assertEquals( expected, actual );

        actual = bs.binarysearchRecursive( array, 1024);
        expected = 13;
        assertEquals( expected, actual );
    }
}