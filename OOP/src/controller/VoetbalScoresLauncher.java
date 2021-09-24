package controller;

import Voetbalscores.Wedstrijd;

import java.util.Scanner;

public class VoetbalScoresLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Wedstrijd eersteWedstrijd = new Wedstrijd("PEC", 5, 0);

        eersteWedstrijd.printUitslag();
        eersteWedstrijd.printWedstrijdPunten();

        System.out.print("Wat is de tegenstander? ");
        String naam = sc.next();

        System.out.print("Doelpunten gescoord: ");
        int voorDoelPunten = sc.nextInt();
        sc.nextLine();

        System.out.print("Doelpunten tegenStander: ");
        int tegenDoelPunten = sc.nextInt();
        sc.nextLine();

        System.out.println();

        Wedstrijd tweedeWedstrijd = new Wedstrijd(naam, voorDoelPunten, tegenDoelPunten);
        tweedeWedstrijd.printUitslag();
        tweedeWedstrijd.printWedstrijdPunten();



    }

}
