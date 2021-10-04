package controller;

import model.Vierkant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int zijde;
        while (true) {
            System.out.print("Geef een zijde van een vierkante: ");
            try {
                zijde = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.err.println("\nGeef een getal!!!!");
            }
            scanner.nextLine();
        }

        Vierkant vierkant = new Vierkant(zijde);

        System.out.println(vierkant);
        System.out.println();

        int oppervlakte;
        double eenZijde;
        while (true) {
            System.out.print("Geef een oppervlakte van een vierkant: ");
            try {
                oppervlakte = scanner.nextInt();
                try {
                    eenZijde = Vierkant.berekenZijde(oppervlakte);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                break;
            } catch (Exception e) {
                System.err.println("Geef een getal!!!!");
            }
            scanner.nextLine();
        }
        System.out.println();
        System.out.printf("Een zijde van de vierkant is %s.\n", eenZijde);
    }
}
