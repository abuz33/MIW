package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLauncher {


    public static void main(String[] args) {
        // declaratie
        Scanner scanner = new Scanner(System.in);
        int getal = 0;
        boolean noGoodInput = true;
        //
        while (noGoodInput) {
            // vraag om input
            System.out.println("geef een getal");
            try {
                // inlezen input
                getal = scanner.nextInt();
                // int ingelezen dus input is goed
                noGoodInput = false;
            }
            catch(InputMismatchException ime){
                // er is iets fout gegaan, geef nieuwe input
                // als het fout is: geef melding
                noGoodInput = true;
                scanner.next(); // lees return in, want anders blijft de scanner deze inlezen.
                System.out.println("exception zegt: "+ime.getMessage());
                System.out.println("verkeerde input. geef een nieuw getal");
            }
        }
        // toon getal
        System.out.println("getal is: " + getal);


    }

}