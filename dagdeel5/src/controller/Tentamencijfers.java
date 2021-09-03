package controller;

import java.util.Scanner;

public class Tentamencijfers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal;

        while (true) {
            while (true) {
                System.out.print("Hoeveel cijfers wilt u invoeren? ");
                if (scanner.hasNextInt()) {
                    getal = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Voer een geldig geheel getal in");
                    scanner.nextLine();
                }
            }
            if (getal != 0) {
                break;
            } else {
                System.out.println("Aantal cijfers moet groter zijn dan 0!");
            }
        }

        double[] nums = new double[getal];
        for (int i = 0; i < nums.length; i++) {
            while (true) {
                System.out.printf("Cijfer student %s: ", i + 1);
                if (scanner.hasNextDouble()) {
                    nums[i] = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Voer een geldig geheel double in");
                    scanner.next();
                }
            }
        }

        System.out.printf("Aantal cijfers   : %s\n" +
                          "Gemiddelde cijfer: %.1f\n" +
                          "Aantal voldoendes: %s\n" +
                          "Hoogste cijfer   : %.1f\n", nums.length, krijgGemiddelde(nums), krijgAantalVoldoendes(nums), krijgHoogsteCijfer(nums));
    }

    public static double krijgGemiddelde(double[] nums) {
        double total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return total / nums.length;
    }

    public static int krijgAantalVoldoendes(double[] nums) {
        int cijfer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 5.5) cijfer++;
        }
        return cijfer;
    }

    public static double krijgHoogsteCijfer(double[] nums) {
        double max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }

        return max;
    }
}
