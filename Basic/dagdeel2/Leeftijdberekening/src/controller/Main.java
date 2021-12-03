package controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int JAAR = 2021;
        // input
        String naam = "";
        int geboorteJaar = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoe heet je?");
        naam = scanner.nextLine();


        System.out.println("Wat is je geboortejaar?");
        geboorteJaar = scanner.nextInt();
        //vermerking
        int leeftijd = JAAR - geboorteJaar;
        // output

        System.out.println(String.format("Beste %s, eind %s zal je leeftijd %s zijn.Ondanks je leeftijd zie je er nog best goed uit!", naam, JAAR ,leeftijd));

    }

}
