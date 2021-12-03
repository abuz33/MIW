package controller;

import java.util.Scanner;

public class Demo2VerhaalBoodschap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat wil je verhalen?");
        String verhal = scanner.nextLine();

        System.out.println("Hoeveel keer? ");
        int keer = scanner.nextInt();

        herhaalBoodschap(verhal, keer);
    }

    private static void herhaalBoodschap(String verhal, int keer) {
//        for (int i = 0; i < keer; i++) {
//            System.out.println(verhal);
//        }

        int i = 0;

//        while (i < keer) {
//            System.out.println(verhal);
//            i++;
//        }

        do {
            System.out.println(verhal);
            i++;
        } while (i < keer);
    }
}
