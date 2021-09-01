package controller;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        double gewicht = 0;
        double lengteInCentimeter =0;
        double bmi;
        String categorie;

        Scanner scanner = new Scanner(System.in);

        lengteInCentimeter = vraagDouble("Geef je lengte in centimeters", scanner);
        gewicht = vraagDouble("Geef je gewicht in kilogram", scanner);
        //vermerking
        bmi = berekenenBMI(lengteInCentimeter, gewicht);
        categorie = keuzeCategorie(bmi);
        //output

        System.out.println("Jouw BMI is: " + bmi+ " " + categorie);
    }

    public static double berekenenBMI(double lengte, double gewicht){
        double bmi = gewicht / Math.pow(lengte/100, 2);
        return (double) Math.round(bmi * 10) / 10;
    }

    public static String keuzeCategorie(double bmi){
        String category;
        if (bmi < 18.5) category = "Ondergewicht";
        else if(bmi >= 18.5 && bmi < 25) category = "Gezond gewicht";
        else if(bmi > 25 && bmi < 30) category = "Overgewicht";
        else category ="Obesitas";

        return category;

    }

    public static double vraagDouble(String vraag, Scanner scanner){
        System.out.println(vraag);
        return scanner.nextDouble();
    }
}
