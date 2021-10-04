package controller;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int aantalNamen = NamenBestandVerwerker.telNamenBestand("9.2 ExtraNamen.txt");
        int aantalNamen2 = NamenBestandVerwerker.telNamenBestand("9.2 GesorteerdeNamenOrigineel.txt");

        ArrayList<String> sorteerdeNamen = NamenBestandVerwerker.leesNamenBestand("9.2 GesorteerdeNamenOrigineel.txt");
        ArrayList<String> extraNamen = NamenBestandVerwerker.leesNamenBestand("9.2 ExtraNamen.txt");
        System.out.printf("Antal sorteerde Namen: %s \nAantal Extra Namen: %s\n", sorteerdeNamen.size(), extraNamen.size());

        NamenBestandVerwerker.voegNaamToeAanGesorteerdeLijst("Zumra", sorteerdeNamen);
        NamenBestandVerwerker.voegNaamToeAanGesorteerdeLijst("Abuzer", sorteerdeNamen);
        NamenBestandVerwerker.voegNaamToeAanGesorteerdeLijst("Ramazan", sorteerdeNamen);

//        NamenBestandVerwerker.voegLijstToeAanGesorteerdeLijst(sorteerdeNamen, extraNamen);

//        NamenBestandVerwerker.maakBestandVanLijst(sorteerdeNamen, "9.2 GesorteerdeNamenNieuw.txt");
        for (String n : sorteerdeNamen) {
            System.out.println(n);
        }
    }
}
