package controller;

import model.Score;
import model.Vak;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final int AANTAL_VAKKEN = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vak[] vakken = new Vak[]{
                new Vak("Fasten Your Seatbelts", 12, 5.5),
                new Vak("Programming", 3, 5.5),
                new Vak("Databases", 3, 5.5),
                new Vak("Personal Skills", 2, 5.5),
                new Vak("Project Skills", 2, 5.5),
                new Vak("OOP 1", 3, 5.5),
                new Vak("User Interaction", 3, 5.5)
        };

        Score[] scores = new Score[AANTAL_VAKKEN];

        System.out.println("Voer behaalde cijfers in: ");
        for (int i = 0; i < AANTAL_VAKKEN; i++) {
            double cijfer = 0;

            while (true) {
                System.out.printf("%-25s: ", vakken[i].getNaam());
                if (sc.hasNextDouble()) {
                    cijfer = sc.nextDouble();
                    break;
                }
                sc.nextLine();
                System.out.printf("%-25s", "Voeg een getal(int)!!!");
            }


            scores[i] = new Score(vakken[i], cijfer);
            sc.nextLine();
        }
        System.out.println("\n");
        for (int i = 0; i < AANTAL_VAKKEN; i++) {
            System.out.printf("Vak/project: %-25s Cijfer:%4.1f Behaalde punten: %2s\n", scores[i].getVak().getNaam(), scores[i].getCijfer(), scores[i].getBehaaldePunten());
        }

        int totaalBehaaldePunten = 0;

        for (int i = 0; i < AANTAL_VAKKEN; i++) {
            totaalBehaaldePunten += scores[i].getBehaaldePunten();
        }
        if (1.0 * totaalBehaaldePunten / 28 < 1.0 * 5 / 6) {
            System.out.printf(ANSI_RED + "\n\nTotaal behaalde studiepunten: %s/28\n" + ANSI_RESET, totaalBehaaldePunten);
            System.out.println(ANSI_RED_BACKGROUND + "PAS OP: je ligt op schema voor een negatief BSA!" + ANSI_RESET);
        } else
            System.out.printf(ANSI_GREEN + "\n\nTotaal behaalde studiepunten: %s/28\n" + ANSI_RESET, totaalBehaaldePunten);
    }
}
