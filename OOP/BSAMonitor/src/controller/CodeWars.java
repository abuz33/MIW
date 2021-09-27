package controller;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodeWars {
    public static void main(String[] args) {

    }

    public static long digital_root(long n) {
        // ...
//        while (n >= 10) {
//            String[] nums = String.valueOf(n).split("");
//            int res = 0;
//            for (String num : nums) {
//                res += Integer.parseInt(num);
//            }
//            n = res;
//        }

        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
    }

    public static int findIt(int[] a) {
        int XOR = 0;
        for (int i : a) {
            XOR ^= i;
        }
        return XOR;
    }

    public static String revRot(String strng, int sz) {
        // your code
        String res = "";
        if (sz <= 0 || strng.equals("") || sz > strng.length()) return "";
        for (int i = 0; i < strng.length() / sz + 1; i++) {
            if ((i + 1) * sz > strng.length()) break;
            String[] nums = strng.substring(i * sz, (i + 1) * sz).split("");
            int total = 0;
            for (String num : nums) {
                total += Integer.parseInt(num);
            }

            if (total % 2 == 0) {
                res += new StringBuilder(String.join("", nums)).reverse().toString();
            } else {
                res += String.join("", nums).substring(1) + String.join("", nums).substring(0, 1);
            }

        }
        return res;

    }

    public static String revRot2(String str, int sz) {
        // your code
        Function<String, String> prd = s -> s.chars().map(c -> c - '0').sum() % 2 == 0 ?
                new StringBuilder(s).reverse().toString() : s.substring(1) + s.substring(0, 1);

        return Arrays.stream(str.split("(?<=\\G.{" + sz + "})"))
                .filter(s -> s.length() == sz)
                .map(s -> prd.apply(s))
                .collect(Collectors.joining());

    }
}
