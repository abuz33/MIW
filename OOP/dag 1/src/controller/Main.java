package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(kPrime(289220) + " " + kPrime(289226));


        // k 3 step 8 start 264422 end 264821
        // k 6 step 7 start 238180 end 238470
        // k 2 step 7 start 212747 end 213148
        // k 2 step 7 start 265729 end 265980
        // k 4 step 6 start 288798 end 289232
        test();

    }

    private static String listArrayLongToString(List<long[]> res) {
        String s = "[";
        int l = res.size();
        for (int i = 0; i < l; i++) {
            long[] a = res.get(i);
            s += "[" + a[0] + ", " + a[1];
            if (i < l - 1) s += "], ";
            else s += "]";
        }
        return s += "]";
    }

    private static void testing(int k, int step, long start, long nd, String expected) {
        List<long[]> a = kprimesStep(k, step, start, nd);
        String actual = listArrayLongToString(a);
        System.out.println("k " + k + " step " + step + " start " + start + " end " + nd);
        System.out.println("got --> " + actual);
//        assertEquals(expected, actual);

    }

    private static void assertEquals(String expected, String actual) {
        if (expected.equals(actual)) System.out.println("Congrats");
        else System.out.println("Get the hell out of here.");
    }

    public static void test() {
        System.out.println("Basic Tests");
//        testing(10, 8, 2425364, 2425700, "[]");
//        testing(6, 8, 2627371, 2627581, "[[2627408, 2627416], [2627440, 2627448], [2627496, 2627504]]");
//        testing(3, 8, 264422, 264821, "");
//        testing(6, 7, 238180, 238470, "");
//        testing(2, 7, 212747, 213148, "");
//        testing(2, 7, 265729, 265980, "");
        testing(4, 6, 288798, 289232, "");
    }


    static int kPrime(int n) {
        int kPrime = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                kPrime++;
            }
        }
        return kPrime;
    }

    public static List<long[]> kprimesStep(int K, int step, long start, long end) {
        // your code
        List<Long> output = new ArrayList<>();
        List<long[]> output2 = new ArrayList<>();

        for (int i = (int) start; i <= (int) end; i++) {
            int res = kPrime(i);
            if (res == K) {
                output.add((long) i);
            }
        }
        for (int i = 0; i < output.size() ; i++) {
            for (int j = i; j < output.size(); j++) {
                if (output.get(j) - output.get(i) > step){
                    break;
                }
                if (output.get(j) - output.get(i) == step) {
                    output2.add(new long[]{output.get(i), output.get(j)});
                }
            }
        }

        return output2;
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

    static ArrayList<Integer> sieveOfEratosthenes(long N) {
        // code here
        boolean[] primes = new boolean[(int) N];
        ArrayList<Integer> primeNums = new ArrayList<>();
        Arrays.fill(primes, true);

        for (long p = 2; p * p < N; p++) {
            if (primes[(int) p]) {
                for (long j = p + p; j < N; j += p) {
                    primes[(int) j] = false;
                }
            }
        }

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) primeNums.add(i);
        }

        return primeNums;
    }

    static List<Long> printKPFNums(int step, int K, long start, long end) {
        // Count prime factors of all numbers
        // till B.
        List<Long> output = new ArrayList<Long>();

        int p_factors[] = new int[(int) (end + 1)];
        Arrays.fill(p_factors, 0);

        for (int p = 2; p <= end; p++)
            if (p_factors[p] == 0)
                for (int i = p; i <= end; i += p)
                    p_factors[i]++;

        // Print all numbers with k prime factors
        for (int i = (int) start; i < end; i++) {
            if (p_factors[i] == K && p_factors[i + 1] - p_factors[i] == step) {
                output.add((long) p_factors[i]);
                output.add((long) p_factors[i + 1]);
            }
        }

        return output;
    }

    public static int gcdByBruteForce(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num2;
    }

    public static int lcm(int num1, int num2) {
        return (num1 / gcd(num1, num2)) * num2;
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static ArrayList<Integer> getXor(ArrayList<Integer> A, int N) {
        // code here
        int m = 0;

        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) m = m ^ A.get(i);

        for (int i = 0; i < A.size(); i++) newArray.add(A.get(i) ^ m);

        return newArray;
    }
}
