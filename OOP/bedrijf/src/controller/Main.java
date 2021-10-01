package controller;

import model.Afdeling;
import model.Persoon;

public class Main {
    public static void main(String[] args) {
        Afdeling uitvoering = new Afdeling("Uitvoering", "Hilversum");
        Afdeling support = new Afdeling("Support", "Amsterdam");
        Afdeling management = new Afdeling("Management", "Almere");
        Afdeling documentatie = new Afdeling("Documentatie", "Gouda");


        System.out.println("1. " + Persoon.aantalPersonen);
        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
        System.out.println("2. " + Persoon.aantalPersonen);
        System.out.println(baas.getPersoneelsNummer());
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println("3. " + Persoon.aantalPersonen);
        System.out.println(medewerker.getPersoneelsNummer());

        Persoon assistent = new Persoon("Klaas");
        Persoon manager = new Persoon();
        System.out.println("4. " + Persoon.aantalPersonen);
        System.out.printf("%s verdient %.2f per jaar en heeft" + (baas.heeftRechtOpBonus() ? "wel" : "geen") + "recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaries());
        System.out.printf("%s verdient %.2f per jaar en heeft " + (baas.heeftRechtOpBonus() ? "wel" : "geen") + " recht op een bonus.\n", medewerker.getNaam(), medewerker.getMaandSalaries());
    }
}
