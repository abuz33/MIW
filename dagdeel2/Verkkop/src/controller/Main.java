package controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double  BTW_HOOG = 1.21;
        final double  BTW_LAAG = 1.06;
        //input
        double inkoopPrijs = 0;
        double winstmarge = 0;
        double verkoopPrijsZonderBTW;
        double verkoopPrijsZesBTW;
        double verkoopPrijsEenTwintigBTW;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inkoopprijs:");
        inkoopPrijs = scanner.nextDouble();

        System.out.println("Winstmarge (in %):");
        winstmarge = scanner.nextDouble();

        //vermerking
        double winstmargeProcent =((100 + winstmarge)/ 100);
        verkoopPrijsZonderBTW = winstmargeProcent * inkoopPrijs ;

        verkoopPrijsEenTwintigBTW = verkoopPrijsZonderBTW * BTW_HOOG;
        verkoopPrijsZesBTW = verkoopPrijsZonderBTW * BTW_LAAG;

        //output
        System.out.printf("Verkoopprijs exclusief BTW : " + verkoopPrijsZonderBTW+"\n "+ "Verkoopprijs inclusief 6% BTW: " + verkoopPrijsZesBTW +"\n "+"Verkoopprijs inclusief 21% BTW: " + verkoopPrijsEenTwintigBTW);

    }
}
