package controller;

import shapes.Point;
import shapes.Rectangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.oppervlakte());
        System.out.println(rectangle.toString());

        Point points[] = new Point[0];
        points[0] = new Point(10,10);
        points[1] = new Point(10,10);
        points[2] = new Point(10,10);


//        buddy(2382, 3679);
//        buddy(381, 4318);
//        buddy(1071625, 1103735);
//        sieveOfEratosthenes(50);
    }

    public static String buddy(long start, long limit) {
        // your code
        long[] sums = new long[(int) limit];


        for (long i = start; i < limit; i++) {
            System.out.println("working 👉");
            long sum = 0;
            for (int j = 1; j < i - 1; j++) {
                if (i % j == 0) sum += j;
            }
        }

        return "Nothing";
    }

    static void sieveOfEratosthenes(int N) {
        // code here
        boolean[] primes = new boolean[N];
        Arrays.fill(primes, true);

        for (int p = 2; p < N; p++) {
            if (primes[p]) {
                System.out.print(p +" ");
                for (int j = p + p; j < N; j += p) {
                    primes[j] = false;
                }
            }
        }
    }
}
