package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle.oppervlakte());
//        System.out.println(rectangle.toString());
//
//        Point points[] = new Point[0];
//        points[0] = new Point(10, 10);
//        points[1] = new Point(10, 10);
//        points[2] = new Point(10, 10);

//        System.out.println(gcdByBruteForce(60, 60));
//        System.out.println("👍" + gcd(60, 60));
//        System.out.println(lcm(60, 12) + "👉");
//        System.out.println(kPrime(1111111));
//
//        System.out.println("😁" + kPrime(2627415));
//        List<long[]> res = kprimesStep(10, 8, 2425364, 2425700);
//        System.out.println("😄" + res.size());
//
//        List<long[]> res2 = kprimesStep(6, 8, 2627371, 2627581);
//        System.out.println("👍" + res2.size());

//        buddy(2382, 3679);
//        buddy(381, 4318);
//        buddy(1071625, 1103735);
//        sieveOfEratosthenes(50);
    }


//    static int kPrime(int n) {
//        int kPrime = 0;
//        for (int i = 2; i <= n; i++) {
//            while (n % i == 0) {
//                n = n / i;
//                kPrime++;
//            }
//        }
//        return kPrime;
//    }
//
//    public static List<long[]> kprimesStep(int K, int step, long start, long end) {
//        // your code
//        List<Long> output = new ArrayList<>();
//        List<long[]> output2 = new ArrayList<>();
//
//        for (int i = (int) start; i <= (int) end; i++) {
//            int res = kPrime(i);
//            if (res == K) {
//                System.out.println(i);
//                output.add((long) i);
//            }
//        }
//        for (int i = 0; i < output.size() - 1; i++) {
//            if (output.get(i + 1) - output.get(i) + 1 == step) {
//                output2.add(new long[]{output.get(i), output.get(i + 1)});
//            }
//        }
//
//        return output2;
//    }
//
//    public static String buddy(long start, long limit) {
//        // your code
//        long[] sums = new long[(int) limit];
//
//
//        for (long i = start; i < limit; i++) {
//            System.out.println("working 👉");
//            long sum = 0;
//            for (int j = 1; j < i - 1; j++) {
//                if (i % j == 0) sum += j;
//            }
//        }
//
//        return "Nothing";
//    }
//
//    static ArrayList<Integer> sieveOfEratosthenes(long N) {
//        // code here
//        boolean[] primes = new boolean[(int) N];
//        ArrayList<Integer> primeNums = new ArrayList<>();
//        Arrays.fill(primes, true);
//
//        for (long p = 2; p * p < N; p++) {
//            if (primes[(int) p]) {
//                for (long j = p + p; j < N; j += p) {
//                    primes[(int) j] = false;
//                }
//            }
//        }
//
//        for (int i = 2; i < primes.length; i++) {
//            if (primes[i]) primeNums.add(i);
//        }
//
//        return primeNums;
//    }
//
//    static List<Long> printKPFNums(int step, int K, long start, long end) {
//        // Count prime factors of all numbers
//        // till B.
//        List<Long> output = new ArrayList<Long>();
//
//        int p_factors[] = new int[(int) (end + 1)];
//        Arrays.fill(p_factors, 0);
//
//        for (int p = 2; p <= end; p++)
//            if (p_factors[p] == 0)
//                for (int i = p; i <= end; i += p)
//                    p_factors[i]++;
//
//        // Print all numbers with k prime factors
//        for (int i = (int) start; i < end; i++) {
//            if (p_factors[i] == K && p_factors[i + 1] - p_factors[i] == step) {
//                output.add((long) p_factors[i]);
//                output.add((long) p_factors[i + 1]);
//            }
//        }
//
//        return output;
//    }
//
//    public static int gcdByBruteForce(int num1, int num2) {
//        while (num1 != num2) {
//            if (num1 > num2)
//                num1 = num1 - num2;
//            else
//                num2 = num2 - num1;
//        }
//        return num2;
//    }
//
//    public static int lcm(int num1, int num2) {
//        return (num1 / gcd(num1, num2)) * num2;
//    }
//
//    static int gcd(int a, int b) {
//        if (a == 0)
//            return b;
//        return gcd(b % a, a);
//    }
//
//    static ArrayList<Integer> getXor(ArrayList<Integer> A, int N) {
//        // code here
//        int m = 0;
//
//        ArrayList<Integer> newArray = new ArrayList<>();
//
//        for (int i = 0; i < A.size(); i++) m = m ^ A.get(i);
//
//        for (int i = 0; i < A.size(); i++) newArray.add(A.get(i) ^ m);
//
//        return newArray;
//    }
}
