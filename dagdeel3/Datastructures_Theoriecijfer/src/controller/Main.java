package controller;

import java.util.Scanner;

public class Main {

    private static final String HET_VAK_1 = "Datastructures";
    private static final String HET_VAK_2 = "Sorting & Searching";
    public static void main(String[] args) {
        extracted(HET_VAK_1);
        extracted(HET_VAK_2);
    }

    private static void extracted(String vak) {
        double eindcijfer = 0;
        boolean eindeStatus;
        int deeltoets1;
        int deeltoets2;
        double deeltoets1Resultaat ;
        double deeltoets2Resultaat ;
        boolean deeltoets1Status;
        boolean deeltoets2Status;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer behaalde punten in voor het vak"+vak+": ");
        deeltoets1 = vraagInt("Datastructures Deeltoets 1:", scanner);
        deeltoets2 = vraagInt("Datastructures Deeltoets 2:", scanner);

        deeltoets1Resultaat = deeltoetsResultaat(deeltoets1);
        deeltoets2Resultaat = deeltoetsResultaat(deeltoets2);
        deeltoets1Status = deeltoetsStatus(deeltoets1);
        deeltoets2Status = deeltoetsStatus(deeltoets2);

        if(deeltoets1Status && deeltoets2Status) {
            eindcijfer = (deeltoets1Resultaat +deeltoets2Resultaat) / 2;
            eindeStatus = true;
        } else {
            eindeStatus = false;
            if (!deeltoets1Status && !deeltoets2Status) {
                eindcijfer = deeltoets1Resultaat < deeltoets2Resultaat ? deeltoets1Resultaat : deeltoets2Resultaat;
            } else if( !deeltoets1Status) {
                eindcijfer = deeltoets1Resultaat;
            } else if(!deeltoets2Status) {
                eindcijfer = deeltoets2Resultaat;
            }
        }
        System.out.println("Cijfer"+vak+ " Deeltoets 1: "+ deeltoets1Resultaat+"            "+(deeltoets1Status ? "voldoende" : "onvoldoende"));
        System.out.println("Cijfer "+vak+ " Deeltoets 2: "+ deeltoets2Resultaat+"           "+(deeltoets2Status ? "voldoende" : "onvoldoende")+"\n\n\n");
        System.out.println("Je hebt een " + (eindeStatus ? "voldoende" : "onvoldoende") + " voor het vak Datastructures.");
        System.out.println(String.format("Je cijfer is %.1f", eindcijfer));
    }

    public static boolean deeltoetsStatus(int cijfer){
        return cijfer < 12 ? false : true;
    }
    public static double deeltoetsResultaat(int cijfer){
        double resultaat;
        if(cijfer < 12) {
            resultaat = (cijfer -1.5) /2;
        } else {
            resultaat = (double)cijfer / 2;
        }
        return resultaat;
    }

    public static int vraagInt(String vraag, Scanner scanner){
        System.out.println(vraag);
        return scanner.nextInt();
    }

}
