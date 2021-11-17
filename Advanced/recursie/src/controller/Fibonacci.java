/**
 * Created by abuzer.alaca on 17/11/2021
 **/


package controller;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fib2(10));
        System.out.println(fib2(4));
    }

    private static long fib(int i) {
        if (i <= 2) return 1;
        return fib(i - 1) + fib(i - 2);
    }

    private static List<Integer> fib2(int n) {
        List<Integer> fibs = new ArrayList<>();
        fibs.add(1);
        fibs.add(1);

        for (int i = 2; i < n; i++) {
            fibs.add(i, (fibs.get(i - 1) + fibs.get(i - 2)));
        }
        return fibs;
    }
}
