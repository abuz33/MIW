package controller;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
         *    Wil je de oppervlakte van een driehoek uitrekenen?
         *    Doorgaan (j/n)?: j
         *   Bereken de oppervlakte van
         *    een driehoek met basis 8 en hoogte 5: 40
         *
         *    Jouw antwoord is fout!
         *    Het juiste antwoord is 20.0.
         *
         *   Wil je de oppervlakte van een driehoek uitrekenen?
         *   Doorgaan (j/n)?:  j Bereken de oppervlakte van
         *   een driehoek met basis 6 en hoogte 2: 6
         *
         *   Jouw antwoord is goed!
         *   Wil je de oppervlakte van een driehoek uitrekenen?
         *   Doorgaan (j/n)?: n
         *   Het programma wordt nu gestopt.
         * */

        Scanner scanner = new Scanner(System.in);
        String antwoord;
        while (true) {
            System.out.println("Wil je de oppervlakte van een driehoek uitrekenen?");
            System.out.println("Doorgaan (j/n) ? ");
            antwoord = scanner.nextLine();

            if (antwoord.equals("j") || antwoord.equals("J")) {
                Random random = new Random();
                int breedte = random.nextInt(10);
                int lengte = random.nextInt(10);

                System.out.println(String.format("Bereken de oppervlakte van een driehoek met basis %s en hoogte %s:", breedte, lengte));
                int oppervlaakte = scanner.nextInt();
                if (oppervlaakte == breedte * lengte / 2) {
                    System.out.println("Jouw antwoord is goed!");
                } else {
                    System.out.println("Jouw antwoord is fout!");
                    System.out.println("Het juiste antwoord is" + (breedte * lengte / 2) + ".");
                }
            } else if (antwoord.equals("n") || antwoord.equals("N")){
                System.out.println("Het programma wordt nu gestopt.");
                break;
            } else {
                System.out.println("Ik heb geen idee wat je schrijft.");
            }
        }


    }
}
