package controller;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Demo1Sommen {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hoevel sommen wil je doen? : ");
        int aantalSommen = scanner.nextInt();



        for (int i = 0; i < aantalSommen; i++) {
            //bedenk 2 random getallen
            int getal1 = 1 + random.nextInt(10); //1..10
            int getal2 = 1 + random.nextInt(10);
            int somAntwoord = getal1 * getal2;

            //print som
            System.out.println(getal1 + " x " + getal2 + " =    (0=einde)");

            //lees antwoord
            int antwoordGebruiker = scanner.nextInt();

            //controleer antwoord
            if (antwoordGebruiker == 0) break; //einde
            else { //som controleren
                if (antwoordGebruiker == somAntwoord) System.out.println("Som goed!");
                else System.out.printf("Verkeerd! Antwoord is " + somAntwoord);
            }
        }
    }


}
