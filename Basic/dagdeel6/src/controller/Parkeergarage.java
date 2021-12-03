package controller;

import java.util.Scanner;

public class Parkeergarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kentekens;
        int[] parkeerdUren;
        double[] parkeerdkosten;
        int aantalKentekens;
        while (true) {
            System.out.print("Hoeveel auto's hebben geparkeerd? ");
            if (scanner.hasNextInt()) {
                aantalKentekens = scanner.nextInt();
                break;
            } else {
                System.out.println("Geef een getal a.u.b.!");
            }
        }
        kentekens = new String[aantalKentekens];
        parkeerdUren = new int[aantalKentekens];
        parkeerdkosten = new double[aantalKentekens];

        for (int i = 0; i < aantalKentekens; i++) {
            System.out.println("\nAuto " + (i + 1));
            System.out.print("    Kenteken: ");
            kentekens[i] = scanner.next();
            int uren;
            while (true) {
                System.out.print("    Geparkeerde uren (max. 24): ");
                if (scanner.hasNextInt()) {
                    uren = scanner.nextInt();
                    if (uren > 24) {
                        System.out.println("    De parkeerduur kan maximaal 24 uur zijn.");
                    } else {
                        System.out.println();
                        break;
                    }
                } else {
                    System.out.println("    Geen een getal a.u.b.!!!");
                    scanner.nextLine();
                }
            }
            parkeerdUren[i] = uren;
        }

        printOverzicht(kentekens, parkeerdUren, parkeerdkosten, aantalKentekens);


    }

    private static void printOverzicht(String[] kentekens, int[] parkeerdUren, double[] parkeerdkosten, int aantalKentekens) {
        System.out.println("Parkeeroverzicht");
        System.out.printf("%s\t%10s\t%10s\n", "Kenteken", "Uren", "Bedrag");

        double total = 0;
        for (int i = 0; i < aantalKentekens; i++) {
            parkeerdkosten[i] = berekenParkeergeld(parkeerdUren[i]);
            System.out.printf("%s\t%10s\t%10.2f\n", kentekens[i], parkeerdUren[i], parkeerdkosten[i]);
            total += parkeerdkosten[i];
        }
        System.out.printf("Totaal van alle parkeergelden: %3.1f euro.", total);
    }

    private static double berekenParkeergeld(int i) {
        double geld;
//        geld = i <= 3 ? i * 3.75 : 3 * 3.75 + (i - 3) * 2.75;
//        geld = geld >= 25 ? 25 : geld;

        if (i <= 3) {
            geld = i * 3.75;
        } else {
            geld = 3 * 3.75 + (i - 3) * 2.75;
            if (geld >= 25) {
                geld = 25;
            }
        }

        return geld;
    }
}
