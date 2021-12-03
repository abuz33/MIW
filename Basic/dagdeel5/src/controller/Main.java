package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        while (true) {
            int getal = getAnInt(sc, "Welke tafel wilt u printen? ");
            while (true) {
                if (countDigit(getal) > 5) {
                    System.out.println("Voer a.u.b. maximaal 4 cijferig nummer in");
                    getal = getAnInt(sc, "Welke tafel wilt u printen? ");
                    continue;
                } else break;
            }

            if (getal == 0) {
                System.out.println("Goededag. Bli je bent er.");
                break;
            }

            int keer = getAnInt(sc, "Hoeveel getal wilt u printen? ");
            while (true) {
                if (countDigit(keer) > 4) {
                    System.out.println("Voer a.u.b. maximaal 3 cijferig nummer in");
                    getal = getAnInt(sc, "Hoeveel getal wilt u printen? ");
                    continue;
                } else break;
            }
            int repeat = 20;
            if (countDigit(getal) > 3 && countDigit(keer) > 3) repeat = 16;
            else if (countDigit(getal) >= 4 || countDigit(keer) >=3) repeat = 18;


            int tafel = getAnInt(sc, "Hoeveel getallenlijn wil je in de tafel? ");
            while (true) {
                if (tafel > repeat) {
                    tafel = getAnInt(sc, String.format("Er kunnen niet meer dan %s nummers in de tabel staan.\nHoeveel getallenlijn wil je in de tafel? ", repeat));
                    continue;
                } else break;
            }

            System.out.printf(String.format("De tafel van %s : ", getal));
            for (int i = 0; i < keer; i++) {
                if (i % tafel == 0) System.out.println("\n");


                if (countDigit(getal) > 2 && countDigit(keer) > 2) System.out.printf("%10s", (i + 1) * getal);
                else System.out.printf("%8s", (i + 1) * getal);
            }

            String antwoord;
            while (true) {
                System.out.println("\nWil je een meer tafel printen? (j/n) ");
                antwoord = sc.next();
                if (antwoord.equals("j") || antwoord.equals("J")) break;
                else if (antwoord.equals("n") || antwoord.equals("N")) break;
                else {
                    System.out.println("Ik begrijp niet. Probeer een meer keer.");
                    sc.nextLine();
                    continue;
                }
            }
            if (antwoord.equals("j") || antwoord.equals("J")) {
                System.out.println("Goed gedaan. Laten we doorgaan met rocken.");
                continue;
            } else if (antwoord.equals("n") || antwoord.equals("N")) {
                System.out.println("Goed dat je met mij samenwerkt.");
                break;
            }
        }
    }

    private static int getAnInt(Scanner sc, String s) {
        int getal;
        while (true) {
            System.out.println(s);
            if (sc.hasNextInt()) {
                getal = sc.nextInt();
                break;
            } else {
                System.out.println("Voer een geldig geheel getal in");
                sc.nextLine();
            }
        }
        return getal;
    }

    static int countDigit(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }
}
