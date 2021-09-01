package controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        String woord;
        double teBetalen;
        double gegeven;
        Scanner scanner = new Scanner(System.in);
        //vermerking
        //output

        toonSterrenVierkant();

        System.out.println("Welke woord wil je vijf keer zien?");
        woord = scanner.nextLine();
        toonWoordVijfKeer(woord);

        toonEerlijkelen(35, 8);

        toonWisselgeld(50, 100);

        teBetalen = vraagDoubleInput("Hoeveel moet je betalen?", scanner);
        gegeven = vraagDoubleInput("Hoeveel heb je gegeven?", scanner);
        toonWisselgeldVoorGevorderden(teBetalen, gegeven);

    }
    public static void toonSterrenVierkant(){
        for (int i=0; i < 4; i++ ){
            System.out.println("* * * *");
        }
    }

    public static void  toonWoordVijfKeer(String woord){
        String vijfKeer = "";
        for (int i=0; i < 5; i++){
            vijfKeer += woord;
        }

        System.out.println( vijfKeer);
    }

    public static void toonEerlijkelen(int euromunten, int mensen){
        int krijg = euromunten / mensen;
        int blijven = euromunten % mensen;
        System.out.println(String.format("Als je %s euromunten verdeeld over %s mensen dan krijgt ieder %s munten en blijven er %s over.", euromunten, mensen,krijg,blijven));
    }

    public static void toonWisselgeld(double mpTeBetalen, double mpBetaald){
        double terug = mpBetaald - mpTeBetalen;
        System.out.println(String.format("Te betalen is %s. Betaald is %s. Je krijgt terug is %s.", mpTeBetalen, mpBetaald, terug));
    }


    public static void toonWisselgeldVoorGevorderden(double mpTeBetalen, double mpBetaald){
        double terug = mpBetaald - mpTeBetalen;
        System.out.println(String.format("Je krijgt %s terug", terug));
    }


    public static double vraagDoubleInput(String inputVraag, Scanner scanner) {
        System.out.println(inputVraag);
        double gevraagdeDouble = scanner.nextDouble();
        return gevraagdeDouble;
    }


}
