package controller;

import java.util.Random;
import java.util.Scanner;

public class Dem3GetalRaden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        while (true) {
            int getal = 1 + random.nextInt(100);
            System.out.println("Dat is jouw tijd te raden.");
            int aantalRaad = 0;
            while (true) {
                System.out.println("Wat is jouw raad eens? ");
                int raad = scanner.nextInt();

                if (raad == getal) {
                    aantalRaad += 1;
                    System.out.println("OOOBBBAAAA!!!! Gefeliciteerd!!! Je raadt het goed. Je raad de getal in " + aantalRaad);
                    break;
                } else if (raad < getal) {
                    aantalRaad += 1;
                    System.out.println("jouw raad is kleiner!!! ");
                } else if (raad > getal) {
                    aantalRaad += 1;
                    System.out.println("Jouw raad is groter!!!");
                }
            }
            System.out.println("Wil je een meer keer spellen? (j/n)");
            scanner.nextLine(); //buffer enter leegmk
            String antwoord = scanner.nextLine();

            if (antwoord.equals("j") || antwoord.equals("j")) {
                continue;
            } else if (antwoord.equals("n") || antwoord.equals("N")) {
                break;
            } else {
                System.out.println("Dat snap ik niet!!! Goede dag!!!");
                break;
            }
        }
    }

}
