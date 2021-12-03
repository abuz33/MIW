package controller;

import java.math.BigInteger;
import java.util.Arrays;

import java.math.BigInteger;

public class ProdSeq {
    public static void main(String[] args) {
        int[] a0 = {0, 7, 0, 0};
        BigInteger[] aa = new BigInteger[2];
        aa[0] = new BigInteger("0");
        aa[1] = new BigInteger("0");
        testing(a0, aa);

        int[] a1 = {1, 3, 1, 2, 1, 5, 1, 9};
        aa[0] = new BigInteger("250");
        aa[1] = new BigInteger("210");
        testing(a1, aa);

        int[] a2 = {2, 1, 3, 4};
        aa[0] = new BigInteger("2");
        aa[1] = new BigInteger("11");
        testing(a2, aa);

        int[] a3 = {3, 9, 8, 4, 6, 8, 7, 8, 4, 8, 5, 6, 6, 4, 4, 5};
        aa[0] = new BigInteger("13243200");
        aa[1] = new BigInteger("25905600");
        testing(a3, aa);

        int[] a4 = {4, 3, 4, 2, 4, 5, 5, 9};
        aa[0] = new BigInteger("870");
        aa[1] = new BigInteger("1190");
        testing(a4, aa);

        int[] a5 = {7, 6, 6, 4, 9, 2, 6, 2, 4, 7, 4, 9, 8, 6, 8, 3};
        aa[0] = new BigInteger("2165800");
        aa[1] = new BigInteger("26210600");
        testing(a5, aa);

        int[] a6 = {3, 2, 9, 9, 3, 6, 8, 7, 5, 2, 4, 9, 3, 9, 8, 4, 2, 3, 3, 6};
        aa[0] = new BigInteger("105928560");
        aa[1] = new BigInteger("340093080");
        testing(a6, aa);

        int[] a7 = {2, 3, 6, 8, 9, 7, 9, 5};
        aa[0] = new BigInteger("780");
        aa[1] = new BigInteger("4160");
        testing(a7, aa);

        int[] a8 = {6, 6, 6, 6};
        aa[0] = new BigInteger("0");
        aa[1] = new BigInteger("72");
        testing(a8, aa);

        aa[0] = new BigInteger("0");
        aa[1] = new BigInteger("54");
        testing(new int[]{3, 3, 9, 9}, aa);

    }

    private static void testing(int[] a0, BigInteger[] aa) {
        BigInteger[] res = solve(a0);
        System.out.printf("%s == %s AND %s == %s\n",aa[0], res[0],aa[1], res[1]);
        System.out.print(String.valueOf(res[0] == aa[0]) + " " +String.valueOf(res[1] == aa[1]) + "\n");
    }

    public static BigInteger[] solve(int[] arr) {
        // your code
        BigInteger[] nums = new BigInteger[2];
        int total = 0;

        for (int i = 0; i < arr.length; i += 2) {
            total += arr[i] * arr[i] + arr[i + 1] + arr[i + 1];
        }

        // run nested loops for first two numbers.
        for (int i = 0; i <= total; ++i) {
            for (int j = i; j <= total; ++j) {
                if (i * i + j * j == total) {
                    nums[0] = BigInteger.valueOf(i);
                    nums[1] = BigInteger.valueOf(j);
                    return nums;
                }
            }
        }
        return nums;
    }

}
