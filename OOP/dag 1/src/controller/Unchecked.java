package controller;

import java.util.Scanner;

public class Unchecked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int getal1 = 0;
        int getal2 = 0;

        int getal3 = 0;
        int getal4 = 0;

        getal1 = getGetal1(sc, "Geef eerste getal: ");
        getal2 = getGetal1(sc, "Geef tweede getal: ");
        getal3 = getGetal1(sc, "Geef deerde getal: ");
        getal4 = getGetal1(sc, "Geef vierde getal: ");

        System.out.printf("Eerste getal is %s\n", getal1);
        System.out.printf("Tweede getal is %s\n", getal2);

        System.out.printf("Derde getal is %s\n", getal3);
        System.out.printf("Vierde getal is %s\n", getal4);

    }

    private static int getGetal1(Scanner sc, String vraag) {
        int getal;
        while (true) {
            System.out.print(vraag);
            if (sc.hasNextInt()) {
                getal = sc.nextInt();
                break;
            } else {
                System.out.println("Dat is not een getal");
            }
            sc.nextLine();
        }
        return getal;
    }

    private static int getGetal2(Scanner sc, String vraag) {
        int getal;
        while (true) {
            System.out.print(vraag);
            try {
                getal = sc.nextInt();
                break;
            } catch (Exception error) {
                System.out.println("Dat is not een getal");
                sc.nextLine();
            }
        }
        return getal;
    }
}
