package launcher;

import java.util.Arrays;
import java.util.Collections;

public class Kata {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String highAndLow(String numbers) {
        // Code here or
        String[] nums = numbers.split(" ");
        Integer[] num = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.parseInt(nums[i]);
        }
        return Collections.max(Arrays.asList(num)) + " " + Collections.min(Arrays.asList(num));
    }
}
