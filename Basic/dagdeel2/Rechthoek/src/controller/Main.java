package controller;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // input
        double oppervlakteInVierkanteCm = 0;
        double lengteInCm = 0;
        double breedteInCm = 0;
        Scanner invoerScanner = new Scanner(System.in);
        // verwerking
        // vraag om lengte
        lengteInCm = vraagDoubleInput("geef lengte van de rechthoek in cm", invoerScanner);
        // vraag om breedte
        breedteInCm = vraagDoubleInput("geef breedte van de rechthoek in cm", invoerScanner);
        // bereken oppervlakte.
        oppervlakteInVierkanteCm = berekenOppervlakte(lengteInCm, breedteInCm);
        // output
        System.out.println("de oppervlakte van de rechthoek is: " + oppervlakteInVierkanteCm);
    }
    public static double berekenOppervlakte(double lengte, double breedte) {
        double oppervlak = lengte * breedte;
        return oppervlak;
    }
    public static double vraagDoubleInput(String inputVraag, Scanner scanner) {
        System.out.println(inputVraag);
        double gevraagdeDouble = scanner.nextDouble();
        return gevraagdeDouble;
    }
}
