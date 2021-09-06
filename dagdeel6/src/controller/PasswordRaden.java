package controller;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PasswordRaden {
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
        Scanner scanner = new Scanner(System.in);

        String[] background = {ANSI_BLACK_BACKGROUND, ANSI_RED_BACKGROUND,
                ANSI_GREEN_BACKGROUND, ANSI_YELLOW_BACKGROUND,
                ANSI_BLUE_BACKGROUND, ANSI_PURPLE_BACKGROUND,
                ANSI_CYAN_BACKGROUND, ANSI_WHITE_BACKGROUND};
        String[] options = {"Black", "Red", "Green", "Yellow", "Blue", "Purple", "Cyan", "White"};
        int aantalkeer;
        int[] wachtwoord;
        int[] antwoordGetalen = new int[4];
        String[] nums;
        String antwoord = "";

        while (true) {
            aantalkeer = 0;
            wachtwoord = genereerKleuren(4);
            System.out.println("U hebt 7 pogingen om mijn kleur wachtwoord te raden! \n");
            for (int i = 0; i < options.length; i++) {
                System.out.printf(background[i] + "  %s  " + ANSI_RESET + "  ", options[i]);
            }
            System.out.printf("\n%5s %9s %9s %11s %10s %10s %10s %9s\n", 1, 2, 3, 4, 5, 6, 7, 8);

            while (true) {
                while (true) {
                    System.out.println();
                    System.out.printf("Geef 4 verschillende getallen tussen 1 en 8, gescheiden door spaties: ");
                    antwoord = scanner.nextLine();
                    nums = antwoord.split(String.valueOf(' '));
                    if (nums.length < 4) {
                        System.out.println("U moet 4 kleuren kiezen!!");
                        continue;
                    }

                    for (int i = 0; i < nums.length; i++) {
                        antwoordGetalen[i] = Integer.parseInt(nums[i]);
                    }

                    if (checkTheNumbers(antwoordGetalen)) break;

                    System.out.println("Geef verschillende getalen of getalen dat minder dan 8 of meer dan 0.");
                }

                System.out.println("Waar of onwaar worden onder uw keuzes geschreven door in te kleuren. Groen betekent ware plaats, geel ware kleuren maar verkeerde plaats en rood betekent verkeerde kleur.");

                System.out.println("Uw keuzes zijn: ");
                for (int i = 0; i < antwoordGetalen.length; i++) {
                    System.out.printf(background[antwoordGetalen[i] - 1] + " %-9s  " + ANSI_RESET + " ", options[antwoordGetalen[i] - 1]);
                }

                int[] waarOfNiet;
                waarOfNiet = checkPlaces(wachtwoord, antwoordGetalen, background);

                System.out.println();
                System.out.println();

                int aantalcorrectieAntwoord = 0;
                for (int i = 0; i < antwoordGetalen.length; i++) {
                    if (waarOfNiet[i] == 2) {
                        System.out.printf(background[2] + " %-9s  " + ANSI_RESET + " ", "Waar");
                        aantalcorrectieAntwoord++;
                    } else if (waarOfNiet[i] == 1) {
                        System.out.printf(background[3] + " %-9s  " + ANSI_RESET + " ", "foutplaats");
                    } else {
                        System.out.printf(background[1] + " %-9s  " + ANSI_RESET + " ", "Niet");
                    }
                }

                System.out.println();
                if (aantalcorrectieAntwoord == 4) {
                    System.out.println("Gefeliciteerd!! Je wist het allemaal.");
                    break;
                }

                aantalkeer++;

                if (aantalkeer == 7) {
                    System.out.println("Volgonde keer");
                    System.out.println("Wachtwoord was: ");
                    for (int i = 0; i < wachtwoord.length; i++) {
                        System.out.print("  " + background[wachtwoord[i] - 1] + "  " + options[wachtwoord[i] - 1] + "  " + ANSI_RESET + "  ");
                    }
                    System.out.println();

                    break;
                }
            }
            String speelEenMeerKeer;
            speelEenMeerKeer = getString(scanner);
            scanner.nextLine();
            if (speelEenMeerKeer.equals("nee")) {
                System.out.println("Tot volgonde keer !!!");
                break;
            } else System.out.println("Laten we gaan spelen.");

        }
    }


    @NotNull
    private static String getString(Scanner scanner) {
        String speelEenMeerKeer;
        while (true) {
            System.out.print("Wil je een meer keer spelen? ja / nee  ");
            speelEenMeerKeer = scanner.next();

            if (speelEenMeerKeer.equals("ja") || speelEenMeerKeer.equals("nee")) {
                break;
            } else {
                System.out.println("Ik begrijp je niew!! Probeer een meer keer!!!");
            }
        }
        return speelEenMeerKeer;
    }

    private static int[] checkPlaces(int[] wachtwoord, int[] antwoordGetalen, String[] background) {
        int[] places = new int[4];
        for (int i = 0; i < antwoordGetalen.length; i++) {
            if (antwoordGetalen[i] == wachtwoord[i]) places[i] = 2;
            else places[i] = 0;

            for (int j = 0; j < antwoordGetalen.length; j++) {
                if (i != j && antwoordGetalen[i] == wachtwoord[j]) {
                    places[i] = 1;
                }
            }
        }

        return places;
    }


    private static boolean checkTheNumbers(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] > 8 || nums[i] <= 0) {
                return false;
            }
            for (int j = i + 1; j < length; j++) {
                if (j != i && nums[j] == nums[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] genereerKleuren(int wachtwoordLengte) {
        int[] list = new int[wachtwoordLengte];
        boolean[] used = new boolean[10 + wachtwoordLengte];
        for (int i = 0; i < wachtwoordLengte; i++) {
            int number = (int) ((8 - i) * Math.random());
            for (int a = 0; a <= number; a++) {
                if (used[a]) {
                    number++;
                }
            }
            list[i] = number + 1;
            used[number] = true;
        }
        return list;
    }


//    Random random = new Random();
//    Set<Integer> numbers = new HashSet<>(4);
//
//        while (numbers.size() < 4) {
//        numbers.add(1 + random.nextInt(8));
//    }
//
//        System.out.println(numbers);

}
