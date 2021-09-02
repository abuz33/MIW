package controller;

import java.util.Scanner;

public class Gemiddelde_4_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totaal = 0;
        int aantal = 0;

        while (true) {
            System.out.println("Dit programma berekent het gemiddelde van twee of meer getallen.");
            System.out.print("Geef het eerste getal: ");
            totaal += scanner.nextInt();
            aantal++;
            scanner.nextLine();

            System.out.print("Geef het tweede getal: ");
            aantal++;
            totaal += scanner.nextInt();

            while (true) {
                String antwoord;
                while (true) {
                    System.out.print("Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ");
                    antwoord = scanner.next();
                    if (antwoord.equals("ja") || antwoord.equals("nee")) break;
                    else System.out.print("Je moet ‘ja’ of ‘nee’ antwoorden.");
                }

                if (antwoord.equals("ja")) {
                    System.out.print("Geef het volgende getal:  ");
                    totaal += scanner.nextInt();
                    aantal++;
                } else {
                    break;
                }
            }

            double gemiddelde = 1.0 * totaal / aantal;
            System.out.printf("Het gemiddelde van jouw %s getallen is %.2f", aantal, gemiddelde);
            break;

        }
    }
}
