package controller;

import java.util.*;
import java.util.stream.IntStream;

public class Array {
    public static void main(String[] args) {
//        double[] cijfer = {1,2,3};
//        cijfer[cijfer.length + 1] = 4;
//        for (int i = 0; i < cijfer.length; i++) {
//            System.out.println(cijfer[i]);
//        }
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Hoeveel Speler? ");
//        int aantalSpelers = scanner.nextInt();
//
//
//        String[] speler = new String[aantalSpelers];
//        int[] scores = new int[aantalSpelers];
//
//        for (int i = 0; i < aantalSpelers; i++) {
//            System.out.printf("Speler %s", i);
//            speler[i] = scanner.next();
//
//            System.out.printf("Score %s: ", i);
//            scores[i] = scanner.nextInt();
//        }
//
//        scanner.close();


//        final int AANTAL_SPELERS = 4;
//
//        Scanner scanner = new Scanner(System.in);
//
//        int[] scores = new int[AANTAL_SPELERS];
//        String[] namen = new String[AANTAL_SPELERS];
//
//        for (int i = 0; i < AANTAL_SPELERS; i++) {
//            //naam
//            System.out.println("Naam speler " + (i + 1) + ":");
//            String naam = scanner.next();
//
//            //score
//            System.out.println("Score speler " + (i + 1) + ":");
//            int score = scanner.nextInt();
//
//            //bewaren in arrays
//            namen[i] = naam;
//            scores[i] = score;
//        }
//
//        System.out.println(namen);
//        System.out.println(scores);
//
//        for (int i = 0; i < AANTAL_SPELERS; i++) {
//            System.out.println(namen[i] + " " + scores[i]);
//        }
//
//        int maxScore = -1;
//        int welkeSpelerHeeftHighScore = -1;
//        for (int i = 0; i < AANTAL_SPELERS; i++) {
//            if (scores[i] > maxScore) {
//                maxScore = scores[i];
//                welkeSpelerHeeftHighScore = i;
//            }
//        }
//
//        System.out.println("Highscore = " + scores[welkeSpelerHeeftHighScore] + " behaald door " + namen[welkeSpelerHeeftHighScore]);

        Random random = new Random();
        int[] getalen = new int[10];
        for (int i = 0; i < 10; i++) {
            getalen[i] = random.nextInt(1000);
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%5s", getalen[i]);
        }
        System.out.println("");

        Arrays.sort(getalen);

//        int temp;
//        for (int i = 0; i < 10; i++) {
//            for (int j = i; j >0; j--) {
//                temp = getalen[j];
//                if (getalen[j] < getalen[j-1]){
//                    getalen[j] = getalen[j - 1];
//                    getalen[j - 1] = temp;
//                }
//            }
//        }

        int totaal = 0;
        for (int i = 0; i < 10; i++) {
            totaal += getalen[i];
        }

        int min = getalen[0];
        int max = getalen[getalen.length - 1];
        int gemidel = totaal / getalen.length;

        System.out.printf("\n%10s %10s %10s %10s\n", "MIN", "GEMIDDEL", "MAX", "TOTAAL");
        System.out.printf("%10s %10s %10s %10s\n", min, gemidel, max, totaal);

        int number = 52451;
        System.out.println(sortDesc(number));
    }

    public static int sortDesc(final int num) {
//        String number = String.valueOf(num);
//        String[] digits = new String[number.length()];
//
//        for (int i = 0; i < number.length(); i++) {
//            digits[i] = String.valueOf(number.charAt(i));
//        }
//        Arrays.sort(digits, Collections.reverseOrder());
//        String temp ="";
//        for (int i = 0; i < number.length() ; i++) {
//            temp += digits[i];
//        }
//        return Integer.parseInt(temp);
        String number = String.valueOf(num);
        int[] digits = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        int temp;
        for (int i = 0; i < number.length(); i++) {
            for (int j = i; j > 0; j--) {
                temp = digits[j];
                if (digits[j] < digits[j - 1]) {
                    digits[j] = digits[j - 1];
                    digits[j - 1] = temp;
                }
            }
        }


        String temp2 = "";
        for (int i = number.length() - 1; i > 0; i--) {
            temp2 += digits[i];
        }
        return Integer.parseInt(temp2);
    }
}
