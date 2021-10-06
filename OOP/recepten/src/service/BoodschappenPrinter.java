package service;

import model.BoodschappenLijst;
import model.WinkelProduct;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BoodschappenPrinter {
    public static void printBoodschappenNaarFile(BoodschappenLijst lijst, String filenaam) {
        String uri = "resources/" + filenaam;
        File file = new File(uri);

        try {
            FileWriter fw = new FileWriter(file);
            ArrayList<WinkelProduct> winkelProducts = lijst.toonBoodschappen();
            for (WinkelProduct w : winkelProducts) {
                fw.write(w.getNaam() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
