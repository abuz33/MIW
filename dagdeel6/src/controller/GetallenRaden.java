//package controller;
//
//import org.jetbrains.annotations.Contract;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class GetallenRaden {
//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
//    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
//    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
//    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
//    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
//    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
//    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
//    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
//    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
//
//    public static void main(String[] args) {
//
//        int[] getalen = genereerGetallen();
//        Scanner scanner = new Scanner(System.in);
//        int aantalkeer = 0;
//
//        while (true) {
//            int[] antwoordGetalen = new int[3];
//            String[] nums;
//            String antwoord = "";
//            int aantalCorrectieGetalen = 0;
//
//            aantalCorrectieGetalen = 0;
//            while (true) {
//                System.out.printf("Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: ");
//                antwoord = scanner.nextLine();
//                nums = antwoord.split(String.valueOf(' '));
//
//                for (int i = 0; i < 3; i++) {
//                    antwoordGetalen[i] = Integer.parseInt(nums[i]);
//                }
//                if (checkTheNumbers(antwoordGetalen)) break;
//
//                System.out.println("Geef verschillende getalen of getalen dat minder dan 10 of meer dan 0.");
//            }
//
//            aantalCorrectieGetalen = getAantalCorrectieGetalen(getalen, antwoordGetalen, aantalCorrectieGetalen);
//
//            System.out.println(ANSI_YELLOW + "Aantal correctie getallen = " + aantalCorrectieGetalen + ANSI_RESET);
//
//            if (aantalCorrectieGetalen == 3) {
//                break;
//            }
//
//            if (aantalkeer == 8) {
//                System.out.println(ANSI_RED + "Volgonde Keer!!!" + ANSI_RESET);
//                break;
//            }
//
//            aantalkeer++;
//
//        }
//
//        System.out.printf(ANSI_GREEN_BACKGROUND + "U heeft %s keer geraden.\n" + ANSI_RESET, aantalkeer);
//        System.out.print("De te raden getallen waren:");
//        for (int i = 0; i < getalen.length; i++) {
//            System.out.print(" " + getalen[i]);
//        }
//    }
//
//    private static boolean checkTheNumbers(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 10 || nums[i] <= 0) {
//                return false;
//            }
//            for (int j = i + 1; j < nums.length; j++) {
//                if (j != i && nums[j] == nums[i]) {
//                    return false;
//                }
//            }
//        }
//
//
//        return true;
//    }
//
//    private static int getAantalCorrectieGetalen(int[] getalen, int[] antwoordGetalen, int aantalCorrectieGetalen) {
//        for (int i = 0; i < getalen.length; i++) {
//            if (komtVoorIn(antwoordGetalen[i], getalen)) aantalCorrectieGetalen++;
//        }
//        return aantalCorrectieGetalen;
//    }
//
//    public static boolean komtVoorIn(int mpZoekgetal, int[] mpLijst) {
//        for (int num : mpLijst) {
//            if (num == mpZoekgetal) return true;
//        }
//        return false;
//    }
//
//    public static int[] genereerGetallen() {
//        int[] getalen = new int[3];
//        Random random = new Random();
//        for (int i = 0; i < 3; i++) {
//            getalen[i] = random.nextInt(10) + 1;
//            if (i >= 1 && getalen[i - 1] == getalen[i]) getalen[i] = random.nextInt(10) + 1;
//
//        }
//
//        return getalen;
//    }
//}
