package controller;

import java.util.Random;
import java.util.Scanner;

public class GetallenRaden {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {

        int[] getalen = genereerGetallen();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int[] antwoordGetalen = new int[3];
            String antwoord = "";
            System.out.printf("Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: ");
            antwoord = scanner.nextLine();
            String[] nums = antwoord.split(String.valueOf(' '));
            for (int i = 0; i < 3; i++) {
                System.out.println(nums[i]);
            }
//            for (int i = 0; i < 3; i++) {
//                while (true) {
//                    if (scanner.hasNextInt()) {
//                        antwoordGetalen[i] = scanner.nextInt();
//                    } else System.out.println("Geef een int a.u.b.!!!");
//                    scanner.nextLine();
//                    if (antwoordGetalen[i] < 0 || antwoordGetalen[i] > 10) {
//                        System.out.println("Geef een nummer tussen 0 en 10.");
//                        continue;
//                    } else break;
//                }
//            }

            for (int i = 0; i < 3; i++) {
                System.out.println(antwoordGetalen[i]);
            }
            break;

        }
    }

    public static boolean komtVoorIn(int mpZoekgetal, int[] mpLijst) {
        for (int num : mpLijst) {
            if (num == mpZoekgetal) return true;
        }
        return false;
    }

    public static int[] genereerGetallen() {
        int[] getalen = new int[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            getalen[i] = random.nextInt(11);
        }
        return getalen;
    }
}
