package nl.hva.miw.ads;

public class BinarySearch {


    /**
     * Find nubmer in an array, using binary search
     *
     * @param array
     * @param number
     * @return index into array where number is found. -1 if not found.
     */
    public int binarysearch( int[] array, int number ) {
        int low = 0;
        int high = array.length - 1;
        int cnt = 0;

        while ( low <= high ) {
            // We are doing into the loop, count it
            cnt++;

            // Find middle
            int mid = (low + high) / 2;

            if ( array[mid] == number ) {
                // Found number, return index
                System.out.println("Found it. Iterations: " + cnt );
                return mid;
            } else if ( array[mid] < number ) {
                // Search in right half
                low = mid + 1;
            } else {
                // Search in left half
                high = mid - 1;
            }
        }

        // If we end here... we did not find it, return -1
        System.out.println("Not Found. Iterations: " + cnt );
        return -1;
    }

    /**
     * Find nubmer in an array, using binary search
     *
     * @param array
     * @param number
     * @return index into array where number is found. -1 if not found.
     */
    public int binarysearchRecursive( int[] array, int number ) {
        return binarysearchRecursive( array, number, 0, array.length - 1, 1 );
    }

    /**
     * Find nubmer in an array, using binary search
     *
     * @param array
     * @param number
     * @param low index
     * @param high index
     * @param cnt how often have we called this
     * @return index into array where number is found. -1 if not found.
     */
    private int binarysearchRecursive( int[] array, int number, int low, int high, int cnt ) {
        // Base case
        if ( low > high ) {
            System.out.println("Recursive not found. Iterations: " + cnt );
            return -1;
        }

        // Find middle
        int mid = (low + high) / 2;

        if ( array[mid] == number ) {
            // Found number, return index
            System.out.println("Recursive found it. Iterations: " + cnt );
            return mid;
        } else if ( array[mid] < number ) {
            // Search in right half
            return binarysearchRecursive( array, number, mid + 1, high, cnt + 1 );
        } else {
            // Search in left half
            return binarysearchRecursive( array, number, low , mid - 1, cnt + 1 );
        }
    }
}
