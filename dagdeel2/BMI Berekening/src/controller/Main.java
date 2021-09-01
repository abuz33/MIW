package controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        double gewicht = 0;
        double lengteInCentimeter =0;
        double bmi = 0;

        Scanner scanner = new Scanner(System.in);

        lengteInCentimeter = vraagDouble("Geef je lengte in centimeters", scanner);
        gewicht = vraagDouble("Geef je gewicht in kilogram", scanner);
        //vermerking
        bmi = gewicht / Math.pow((lengteInCentimeter/100), 2);
        //output

        System.out.println("Jouw BMI is: " + bmi);
    }

    public static double vraagDouble(String vraag, Scanner scanner){
        System.out.println(vraag);
        return scanner.nextDouble();
    }
}
