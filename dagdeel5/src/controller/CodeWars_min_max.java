package controller;

public class CodeWars_min_max {
    public static void main(String[] args) {
        String numbers = "1 2 3 4 5";
        String res = highAndLow(numbers);
        System.out.println(res);
    }

    public static String highAndLow(String numbers) {
        // Code here or
        String[] parts = numbers.split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        Integer max = nums[0];
        Integer min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
            if (min > nums[i])
                min = nums[i];
        }

        return String.format("%d %d", max, min);
    }
}
