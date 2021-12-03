package com.company;

import java.util.Scanner;

public class MoneyExchange {
    private static final double DOLAR_KOERS = 1.23843;
    private static final double POND_KOERS = 0.88459;
    private static final double YEN_KOERS = 134.64711;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("In te wisselen bedrag (alleen gehele getallen): ");
        int wisselenBedrag = scanner.nextInt();
        moneyExchangeA(wisselenBedrag);
        moneyExchangeB(wisselenBedrag /2);

    }
    public static void moneyExchangeA(int wisselenBedrag){
        double gedragDollar = wisselenBedrag * DOLAR_KOERS;
        double gedragPond = wisselenBedrag*POND_KOERS;
        double gedragYen = wisselenBedrag*YEN_KOERS;

        System.out.println(String.format("U krijgt hiervoor %.2f Dollar. (Koers 1.23843).\n" +
                "U krijgt hiervoor %.2f Pond. (Koers 0.88459).\n" +
                "U krijgt hiervoor %.2f Yen. (Koers 134.64711).\n", gedragDollar, gedragPond, gedragYen));
    }

    public static void moneyExchangeB(int wisselenBedrag) {
        double transactieKosten;

        if (wisselenBedrag *0.015 < 2) {
            transactieKosten = 2;
        } else if(wisselenBedrag *0.015 > 15){
            transactieKosten= 15;
        } else {
            transactieKosten = wisselenBedrag *0.015;
        }

        wisselenBedrag -= transactieKosten;
        int gedragDollar = (int)Math.round(wisselenBedrag * DOLAR_KOERS);
        int gedragPond = (int)Math.round(wisselenBedrag*POND_KOERS);
        int gedragYen = (int)Math.round(wisselenBedrag*YEN_KOERS);

        System.out.println(String.format("De transactiekosten bedragen %.1f Euro.\n"+
                "We rekenen daarom %s Euro voor u om.\n" +
                "U krijgt hiervoor %s Dollar. (Koers 1.23843).\n" +
                "U krijgt hiervoor %s Pond. (Koers 0.88459).\n" +
                "U krijgt hiervoor %s Yen. (Koers 134.64711).\n", transactieKosten,wisselenBedrag,gedragDollar, gedragPond, gedragYen));

    }
}
