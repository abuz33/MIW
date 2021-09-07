package controller;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] stappen = new int[7];
        int minimalAantalStap;
        int totaal = 0;
        double gemiddeldStappen;
        double kcal;
        double gemiddeldKcal;
        int genoegOfNiet = 0;
        String message = ANSI_RED_BACKGROUND + "Je hebt te weinig stappen gelopen op: ";

        String[] dagen = {"maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};

        while (true) {
            minimalAantalStap = vraagGetal(scanner, "Hoeveel stappen wil je minimaal lopen per dag? ");
            if (minimalAantalStap >= 5000) break;
            System.out.println("      Stel je doel hoger, minimaal 5000 stappen per dag! ");
        }

        System.out.println("Voer het aantal stappen per dag: ");
        for (int i = 0; i < stappen.length; i++) {
            stappen[i] = vraagGetal(scanner, "      " + dagen[i] + ": ");
            if (stappen[i] >= minimalAantalStap) genoegOfNiet++;
            if (i == stappen.length - 1) message += dagen[i]+". ";
            else message += dagen[i] + ", ";
            totaal += stappen[i];
        }

        gemiddeldStappen = berekenenGemiddeld(totaal);
        kcal = berekenenKcal(totaal);
        gemiddeldKcal = kcal / 7;
        if (genoegOfNiet == 7) message = ANSI_GREEN + "Je hebt alle dagen genoeg gelopen, ga zo door!";
        message += ANSI_RESET;
        System.out.printf(ANSI_GREEN + "Je hebt deze week in totaal %s stappen gelopen \n" + ANSI_RESET, totaal);
        System.out.printf(ANSI_BLUE + "Je hebt hiermee %.2f kCal verbrand. \n" + ANSI_RESET, kcal);
        System.out.printf(ANSI_GREEN + "Je hebt per dag gemiddeld %.2f stappen gelopen \n" + ANSI_RESET, gemiddeldStappen);
        System.out.printf(ANSI_BLUE + "Je hebt hiermee per dag gemiddeld %.2f kCal verbrand. \n" + ANSI_RESET, gemiddeldKcal);
        System.out.println(message);

    }

    private static int vraagGetal(Scanner scanner, String s) {
        int getal;
        while (true) {
            System.out.print(s);
            if (scanner.hasNextInt()) {
                getal = scanner.nextInt();
                break;
            } else {
                System.out.println("Geef een nummer aub.");
                scanner.nextLine();
            }
        }
        return getal;
    }

    private static double berekenenKcal(int totaal) {
        return 1.0 * totaal * 0.03;
    }

    private static double berekenenGemiddeld(int totaal) {
        return 1.0 * totaal / 7;
    }


}
