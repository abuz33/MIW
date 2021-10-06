package controller;

import database.DBaccess;


public class BoodschappenLauncher {

    public static void main(String[] args) {
        // stap 0
        System.out.println("Welkom bij de recepten app van MiC, geschreven door: Abuzer cohort03 497425");
        System.out.println();
//
//        // stap 1: winkelproduct
//        WinkelProduct wp1 = new WinkelProduct("bief", 35, 200);
//        WinkelProduct wp2 = new WinkelProduct("kip", 25, 100);
//        WinkelProduct wp3 = new WinkelProduct("zalm", 50, 75);
//        WinkelProduct wp4 = new WinkelProduct("tomaat", 5, 30);
//        WinkelProduct wp5 = new WinkelProduct("sla", 0, 50);
//        WinkelProduct wp6 = new WinkelProduct("bloemkool", 35, 120);
//        WinkelProduct wp7 = new WinkelProduct("wijn", 70, 180);
//        // print zelf de net aangemaakte objecten, om te testen
//        System.out.println("stap 1");
//        System.out.println(wp1);
//        System.out.println(wp2);
//
//
//        // stap 2: ingredient
//        // stap 3: groente,vlees,vloeistof
//        Vlees v1 = new Vlees(wp1, 400, 8);
//        Vlees v2 = new Vlees(wp2, 250, 5);
//        Groente g1 = new Groente(wp4,240);
//        Groente g2 = new Groente(wp5,400);
//        Vloeistof vl1 = new Vloeistof(wp7,300);
//        // print zelf de net aangemaakte objecten, om te testen
//        System.out.println("stap 2 en 3");
//        System.out.println(v1);
//        System.out.println(v2);
//        System.out.println(g1);
//        System.out.println(g2);
//        System.out.println(vl1);
//
//
//
//        // stap 4: boodschappenlijst
//        BoodschappenLijst boodschappenLijst = new BoodschappenLijst();
//        // voeg WinkelProducten toe
//        boodschappenLijst.voegProductToe(wp1);
//        boodschappenLijst.voegProductToe(wp2);
//        boodschappenLijst.voegProductToe(wp3);
//        boodschappenLijst.voegProductToe(wp4);
//        boodschappenLijst.voegProductToe(wp5);
//        boodschappenLijst.voegProductToe(wp6);
//        boodschappenLijst.voegProductToe(wp7);
//        // print zelf de net aangemaakte projecten, om te testen
//        System.out.println("stap 4");
//        System.out.println(boodschappenLijst);
//
//        // stap 5: recept
//        // stap 6: sorteer en print boodschappenlijst
//        Recept recept = new Recept("vleesdiner");
//        recept.voegIngredientToe(v1);
//        recept.voegIngredientToe(v2);
//        Recept recept2 = new Recept("alleengroente");
//        recept2.voegIngredientToe(g1);
//        // print
//        System.out.println("stap 5 en 6");
//        System.out.println(recept);
//        System.out.println("boodschappenlijst recept");
//        recept.getBoodschappenLijst().printGesorteerdeLijst();
//        System.out.println(recept2);
//        System.out.println("boodschappenlijst recept");
//        recept.getBoodschappenLijst().printGesorteerdeLijst();
//
//        System.out.println("stap 6");
//        boodschappenLijst.printGesorteerdeLijst();
//
//        // stap 7: print naar file
//        System.out.println("stap 7");
//        BoodschappenPrinter.printBoodschappenNaarFile(boodschappenLijst,"boodschappenlijst.txt");
//
//        // stap 8: sla op in database
//        DBaccess dBaccess = new DBaccess();
//        dBaccess.openConnection();
//        WinkelProductPerReceptDAO winkelProductPerReceptDAO = new WinkelProductPerReceptDAO(dBaccess);
//        winkelProductPerReceptDAO.voegWinkelProductToeAanRecept(wp1,recept);
//        winkelProductPerReceptDAO.voegWinkelProductToeAanRecept(wp2,recept);
//        dBaccess.closeConnection();


    }
}
