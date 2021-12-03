package controller;

import java.util.Scanner;

public class Main {
    private static final double DOLAR_KOERS = 0.85;
    private static final double POND_KOERS = 1.16;
    private static final double YEN_KOERS = 0.0077;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Valuta (1 = US dollar, 2 = GB pounds, 3 = Yen):");
            int valuta = scanner.nextInt();
            scanner.nextLine();
            System.out.println("In te wisselen bedrag (alleen gehele getallen): ");
            int wisselenBedrag = scanner.nextInt();
            moneyExchangeA(wisselenBedrag, valuta);
            moneyExchangeB(wisselenBedrag, valuta);
            System.out.println("Wil je een meer keer proberen? (j/n) : ");
            String antwoord = scanner.next();
            if (antwoord.equals("j") || antwoord.equals("J")) {
                System.out.println("Bedankt!!");
                continue;
            } else if (antwoord.equals("n") || antwoord.equals("N")) {
                System.out.println("Bedankt voor uw exchange!!!");
                break;
            } else {
                System.out.println("Snap ik niet. Goede Dag!!!!");
                break;
            }
        }


    }

    public static void moneyExchangeA(int wisselenBedrag, int valuta) {
        double gedrag;
        if (valuta == 1) {
             gedrag= wisselenBedrag * DOLAR_KOERS;
            System.out.println(String.format("Voor %s  US Dollar krijgt u %.2f Euro.", wisselenBedrag, gedrag));
        } else if (valuta == 2) {
            gedrag = wisselenBedrag * POND_KOERS;
            System.out.println(String.format("Voor %s  GB Pond krijgt u %.2f Euro.", wisselenBedrag, gedrag));
        } else {
            gedrag = wisselenBedrag * YEN_KOERS;
            System.out.println(String.format("Voor %s  GB Pond krijgt u %.2f Euro.", wisselenBedrag, gedrag));
        }
//        System.out.println(String.format("U krijgt hiervoor %.2f Dollar. (Koers 1.23843).\n" +
//                "U krijgt hiervoor %.2f Pond. (Koers 0.88459).\n" +
//                "U krijgt hiervoor %.2f Yen. (Koers 134.64711).\n", gedragDollar, gedragPond, gedragYen));
    }

    public static void moneyExchangeB(int wisselenBedrag, int valuta) {
        double transactieKosten;
        double gedrag;
        if (valuta == 1) {
            gedrag= wisselenBedrag * DOLAR_KOERS;
            transactieKosten = getTransactieKosten(gedrag);
            double bedrag = gedrag - transactieKosten;
            System.out.println(String.format("Voor %s  US Dollar krijgt u %.2f Euro.", wisselenBedrag, gedrag));
            System.out.println(String.format("De transactiekosten bedragen %.2f Euro.", transactieKosten));
            System.out.println(String.format("U ontvangt %.2f", bedrag));
        } else if (valuta == 2) {
            gedrag = wisselenBedrag * POND_KOERS;
            transactieKosten = getTransactieKosten(gedrag);
            double bedrag = gedrag - transactieKosten;
            System.out.println(String.format("Voor %s  GB Pond krijgt u %.2f Euro.", wisselenBedrag, gedrag));
            System.out.println(String.format("De transactiekosten bedragen %.2f Euro.", transactieKosten));
            System.out.println(String.format("U ontvangt %.2f", bedrag));
        } else {
            gedrag = wisselenBedrag * YEN_KOERS;
            transactieKosten = getTransactieKosten(gedrag);
            double bedrag = gedrag - transactieKosten;
            System.out.println(String.format("Voor %s  GB Pond krijgt u %.2f Euro.", wisselenBedrag, gedrag));
            System.out.println(String.format("De transactiekosten bedragen %.2f Euro.", transactieKosten));
            System.out.println(String.format("U ontvangt %.2f", bedrag));
        }

        transactieKosten = getTransactieKosten(wisselenBedrag);
//
//        wisselenBedrag -= transactieKosten;
//        int gedragDollar = (int) Math.round(wisselenBedrag * DOLAR_KOERS);
//        int gedragPond = (int) Math.round(wisselenBedrag * POND_KOERS);
//        int gedragYen = (int) Math.round(wisselenBedrag * YEN_KOERS);

//        System.out.println(String.format("De transactiekosten bedragen %.1f Euro.\n" +
//                "We rekenen daarom %s Euro voor u om.\n" +
//                "U krijgt hiervoor %s Dollar. (Koers 1.23843).\n" +
//                "U krijgt hiervoor %s Pond. (Koers 0.88459).\n" +
//                "U krijgt hiervoor %s Yen. (Koers 134.64711).\n", transactieKosten, wisselenBedrag, gedragDollar, gedragPond, gedragYen));

    }

    private static double getTransactieKosten(double wisselenBedrag) {
        double transactieKosten;
        if (wisselenBedrag * 0.015 < 2) {
            transactieKosten = 2;
        } else if (wisselenBedrag * 0.015 > 15) {
            transactieKosten = 15;
        } else {
            transactieKosten = wisselenBedrag * 0.015;
        }
        return transactieKosten;
    }
}
