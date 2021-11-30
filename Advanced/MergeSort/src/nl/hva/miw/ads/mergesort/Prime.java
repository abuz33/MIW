package nl.hva.miw.ads.mergesort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prime {

    private static void numberGuessGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(100 + 1);
        int numGuess = 0;
        int userGuess = 0;
        System.out.println("Let's  Begin");
        System.out.println("You have 8 chance to find the number.");
        while (true) {
            System.out.print("What is your guess: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                scanner.nextLine();
                if (userGuess > 100 || userGuess < 0) {
                    System.out.println("Your guess must be between 0 and 100");
                    continue;
                }
                if (number != userGuess) {
                    System.out.println("Wrong guess");
                    if (number > userGuess) System.out.println("Too Less");
                    if (number < userGuess) System.out.println("Too Much");
                } else {
                    System.out.println("Congratulations!!!");
                }
                numGuess++;
                if (numGuess == 8) {
                    System.out.println("Out luck! Try again");
                    break;
                }
            } else {
                scanner.nextLine();
                System.out.println("Enter a Number between 0 & 100!!!");
            }
        }
    }

    public static void primeN(int number) {
        int count = 0;
        boolean[] isPrimes = new boolean[number + 1];
        Arrays.fill(isPrimes, true);
        for (int p = 2; p * p <= number; p++) {
            if (isPrimes[p]) {
                for (int i = p * p; i <= number; i += p)
                    isPrimes[i] = false;
            }
        }
        // Print all prime numbers
        for (int i = 2; i <= number; i++) {
            if (isPrimes[i])
                count++;
        }
        System.out.println(count);
    }

    static void primeN2(int N) {
        // Declaring the variables
        int x, y, flg;
        int count = 0;

        // Printing display message
        System.out.println(
                "All the Prime numbers within 1 and " + N
                        + " are:");

        // Using for loop for traversing all
        // the numbers from 1 to N
        for (x = 1; x <= N; x++) {

            // Omit 0 and 1 as they are
            // neither prime nor composite
            if (x == 1 || x == 0)
                continue;

            // Using flag variable to check
            // if x is prime or not
            flg = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }

            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
                count++;
        }
        System.out.println(count);
    }

    public static void primeN3(int N) {
        // Declaring the variables
        int x, y, flg;
        int count = 0;

        // Printing display message
        System.out.println(
                "All the Prime numbers within 1 and " + N
                        + " are:");

        // Using for loop for traversing all
        // the numbers from 1 to N
        for (x = 2; x <= N; x++) {

            // Using flag variable to check
            // if x is prime or not
            flg = 1;

            for (y = 2; y * y <= x; y++) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }

            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
                count++;
        }
        System.out.println(count);
    }
}
