package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLauncherMetPlayerInputClass {

    public static void main(String[] args) {
        // declaratie
        PlayerInput playerInput = new PlayerInput();
        int getal = 0;
        boolean noGoodInput = true;
        //
        while (noGoodInput) {
            try {
                // vraag om input & inlezen input
                getal = playerInput.vraagOmGetal("geef een getal");
                // int ingelezen dus input is goed
                noGoodInput = false;
            }
            catch(VerkeerdeInputException ime){
                // er is iets fout gegaan, geef nieuwe input
                // als het fout is: geef melding
                noGoodInput = true;
                playerInput.skipEnter();
                System.out.println("exception zegt: "+ime.getMessage());
                System.out.println("oorzaak van mijn exception is: "+ime.getCause());

                System.out.println("verkeerde input. geef een nieuw getal");
            }
            
        }
        // toon getal
        System.out.println("getal is: " + getal);


    }

}
