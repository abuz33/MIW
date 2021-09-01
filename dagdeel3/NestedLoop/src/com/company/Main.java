package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        // 1. Gebruiker krijgt een som (bijvoorbeeld 9 x 3)
//        // Gebruiker geeft een antwoord
//        // Als het antwoord goed is, krijgt hij/zij de melding “Goed zo!”
//        // Als het antwoord niet goed is, krijgt hij/zij het juiste antwoord en de melding “Volgende keer beter”
//        Random random = new Random();
//
//        int getal1 = random.nextInt(10);
//        int getal2 = random.nextInt(10);
//
//        int antwoord = getal1 * getal2;
//        int antwoordGebruiker = 0;
//        Scanner scan = new Scanner(System.in);
//
//        while (antwoord != antwoordGebruiker) {
//            while (true) {
//                try {
//                    System.out.print("Wat is de resultaat van de operatie " + getal1 + "x" + getal2);
//
//                    antwoordGebruiker = scan.nextInt();
//
//                    break;
//                } catch (InputMismatchException notNumber) { // << catch the exception and print the error message
//                    System.err.println("\nGeen Integer!!!");
//                }
//            }
//
//            if (antwoordGebruiker == antwoord) {
//                System.out.println("Congrats!!!");
//                break;
//            } else {
//                System.out.println("Niet Goed. Probeer een meer keer.");
//                System.out.println("Jouw antwood is " + antwoordGebruiker);
//            }
//        }

//        int attempt = 1;
//        int userGuessNumber = 0;
//        int secretNumber = (int) (Math.random() * 99 + 1);
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Welcome to Guess Number Game \nYou Will Be Asked To Guess A Number To Win The Game \nYou have Maximum 5 Attemp Limit");
//        do {
//            System.out.print("Enter a guess number between 1 to 100\n");
//            if (userInput.hasNextInt()) {
//                userGuessNumber = userInput.nextInt();
//                if (userGuessNumber == secretNumber) {
//                    System.out.println("OOhhOO!, Your Number is Correct. You Win the Game!");
//                    break;
//                } else if (userGuessNumber < secretNumber)
//                    System.out.println("Your Guess Number is Smaller.");
//                else if (userGuessNumber > secretNumber)
//                    System.out.println("Your Guess Number is Greater.");
//                if (attempt == 5) {
//                    System.out.println("You have exceeded the maximum attempt. Try Again");
//                    break;
//                }
//                attempt++;
//            } else {
//                System.out.println("Enter a Valid Integer Number");
////                break;
//            }
//        } while (userGuessNumber != secretNumber);
//        String s = "abcde";
//
//        for (int i = 0; i < solution(s).length; i++) {
//            System.out.println(solution(s)[i]);
//        }

        int keuze = 1;

        switch (keuze) {
            case 1:
                System.out.println("keuze is 1");
                break;
            case 2:
                System.out.println("keuze is 2");
                break;
            case 3:
                System.out.println("keuze is 3");
                break;
            default:
                break;
        }


    }

//    public static String[] solution(String s) {
//        int length = s.length() % 2 == 1 ? s.length() / 2 +1 : s.length() / 2;
//
//        String[] parts = new String[length];
//        for (int i = 0; i < s.length(); i += 2) {
//            if (s.length() % 2 != 0 && i == s.length() - 1) {
//                parts[i/2] =s.substring(i, s.length())+"_";
//            } else {
//                parts[i/2] = (s.substring(i, i + 2));
//            }
//        }
//        return parts;
//    }
}
