package controller;

public class Array_Oefenen {
    public static void main(String[] args) {
        while (true) {
            while (true) {
                System.out.print("Hoeveel cijfers wilt u invoeren? ");
                if (scanner.hasNextInt()) {
                    getal = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Voer een geldig geheel getal in");
                    scanner.nextLine();
                }
            }
            if (getal != 0) {
                break;
            } else {
                System.out.println("Aantal cijfers moet groter zijn dan 0!");
            }
        }
    }

    public static int[] maakRandomRijGetallen(int mpAantal, int mpMaximum){
        int[] nums = new int[mpAantal];
        for (int i = 0; i < mpAantal; i++) {
            nums[i] = (int) Math.random() * mpMaximum;
            System.out.println(nums[i]);
        }

        return nums;
    };
}
