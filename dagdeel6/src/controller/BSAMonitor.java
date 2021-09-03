package controller;

import java.util.Scanner;

public class BSAMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vakken = {"Fasten Your Seatbelts", "Programming", "User Interaction", "Personal Skills", "Project Skills", "OOP", "Databases"};
        int[] vakStudiePunten = {12, 3, 3, 2, 2, 3, 3};
        double[] vakCijfers = new double[7];

        System.out.println("Voer behaalde cijfers in: ");
        for (int i = 0; i < vakken.length; i++) {
            while (true) {
                System.out.printf("%s :", vakken[i]);
                if (scanner.hasNextDouble()) {
                    vakCijfers[i] = scanner.nextDouble();
                } else System.out.println("Geef een Double a.u.b.!!!");
                scanner.nextLine();
                if (vakCijfers[i] < 0 || vakCijfers[i] > 10) {
                    System.out.println("Geef een nummer tussen 0 en 10.");
                    continue;
                } else break;
            }
        }

        int totaalStudiePunten = 0;
        System.out.println();
        for (int i = 0; i < vakken.length; i++) {
            int behaaldePunt = 0;
            if (vakCijfers[i] >= 5.5) {
                behaaldePunt = vakStudiePunten[i];
            }
            totaalStudiePunten += behaaldePunt;
            System.out.printf("Vak/project: %-23s \tCijfer: %.1f \tBehaalde punten: %s\n",
                    vakken[i],
                    vakCijfers[i],
                    behaaldePunt);
        }
        System.out.printf("Totaal behaalde studiepunten: %s/28\n", totaalStudiePunten);
        if ((double)totaalStudiePunten / 28 < (double)5 / 6) System.out.println("PAS OP: je ligt op schema voor een negatief BSA! ");


    }
}
