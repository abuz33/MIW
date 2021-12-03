package controller;

import java.util.Scanner;

public class Dobbelsteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welk karakter moet ik gebruiken voor het oog: ");
        String antwoord = scanner.nextLine().substring(0,1);
        int getal =0 ;

        while (getal != 6) {
            getal = (int)(Math.random() * ((6 - 1) + 1)) + 1;
            if (getal == 1) een(antwoord);
            else if (getal == 2) twee(antwoord);
            else if (getal == 3) drie(antwoord);
            else if (getal == 4) vier(antwoord);
            else if (getal == 5) vijf(antwoord);
            else if (getal == 6) zes(antwoord);
            System.out.println();
        }

    }
    public static void een(String s){
        System.out.println();
        System.out.printf(" %s\n", s);
        System.out.println();
    }

    public static void twee(String s){
        System.out.printf("%s  \n", s);
        System.out.println();
        System.out.printf("  %s\n", s);
    }

    public static void drie(String s){
        System.out.printf("%s\n", s);
        System.out.printf(" %s\n", s);
        System.out.printf("  %s\n", s);
    }

    public static void vier(String s){
        System.out.printf("%s %s\n",s, s);
        System.out.println();
        System.out.printf("%s %s\n",s, s);
    }

    public static void vijf(String s){
        System.out.printf("%s %s\n",s, s);
        System.out.printf(" %s\n", s);
        System.out.printf("%s %s\n",s, s);
    }

    public static void zes(String s){
        System.out.printf("%s %s\n",s, s);
        System.out.printf("%s %s\n",s ,s);
        System.out.printf("%s %s\n",s ,s);
    }
}
