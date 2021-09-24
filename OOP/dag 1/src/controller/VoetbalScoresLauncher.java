package controller;

import model.Voetbalscores.Team;
import model.Voetbalscores.Wedstrijd;

import java.util.Arrays;
import java.util.Scanner;

public class VoetbalScoresLauncher {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Wedstrijd eersteWedstrijd = new Wedstrijd("PEC", 5, 0);
//
//        eersteWedstrijd.printUitslag();
//        eersteWedstrijd.printWedstrijdPunten();
//
//        System.out.print("Wat is de tegenstander? ");
//        String naam = sc.next();
//
//        System.out.print("Doelpunten gescoord: ");
//        int voorDoelPunten = sc.nextInt();
//        sc.nextLine();
//
//        System.out.print("Doelpunten tegenStander: ");
//        int tegenDoelPunten = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println();
//
//        Wedstrijd tweedeWedstrijd = new Wedstrijd(naam, voorDoelPunten, tegenDoelPunten);
//        tweedeWedstrijd.printUitslag();
//        tweedeWedstrijd.printWedstrijdPunten();

        Team twente = new Team("Twente", 15, 28, 12);
        twente.printStatusTeam();


        System.out.println("\nHello world !! I came here !!!".replaceAll("(\\w)(\\w*)", "$2$1ay"));
        System.out.println(zeros(digital_root(493193)));

    }

    public static int zeros(int n) {
        // your beatiful code here
        int num = 0;
        while (n >= 5) {
            n = n / 5;
            num += Math.floor(n);
        }

        return num;
    }

    public static int digital_root(int n) {
        // ...
        int res = 0;
        if (n < 10) return n;
        else {
            String[] nums = String.valueOf(n).split("");
            for (String i : nums) {
                res += Integer.parseInt(i);
            }
        }
        if (res < 10) {
            return res;
        } else return digital_root(res);
    }

}
