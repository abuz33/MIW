package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BoodschappenLijst {
    private ArrayList<WinkelProduct> boodschappen;

    public BoodschappenLijst() {
    }


    // getter van boodschappen
    public ArrayList<WinkelProduct> toonBoodschappen() {
        return boodschappen;
    }

    // setter van boodschappen
    public void voegProductToe(WinkelProduct product) {
        boodschappen.add(product);
    }

    public void printGesorteerdeLijst() {
        Collections.sort(boodschappen);

        for (WinkelProduct p : boodschappen) {
            System.out.println(p);
        }
    }
}
