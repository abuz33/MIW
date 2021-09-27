package launcher;

import model.*;

public class HuisdierLauncher {

    public static void main(String[] args) {
        // maak huisdier aan
        // Je mag geen huisdier object maken, WANT je hebt geen
        // implementatie van methode maakGeluid(). En objecten MOETEN altijd
        // implementaties hebben van ALLE methoden.
        // Huisdier hd = new Huisdier("jalsum");
        // maak hond aan
        Hond h1 = new Hond("fifi",true);
        // maak cat aan
        Cat k1 = new Cat("minoes");
        // maak cavia
        Cavia carola = new Cavia("carola");
        // maak geluid
        carola.maakGeluid();
        h1.maakGeluid();
        k1.maakGeluid();
        // verhuis naar baas
        h1.verhuisNaarNieuweBaas("boris");
        System.out.println(h1.getNaam());
        System.out.println();

        // dierenasiel aanmaken
        DierenAsiel asiel = new DierenAsiel("KenniesKennel");
        // stop huisdieren in dierenasiel
        asiel.voegHuisDierToe(carola);
        asiel.voegHuisDierToe(k1);
        asiel.voegHuisDierToe(h1);
        // print alle dieren in het asiel
        asiel.toonAlleHuisDieren();
        // laat alle dieren geluid maken
        System.out.println();
        asiel.laatAlleDierenGeluidMaken();


    }
}
