package controller;

import model.Auto;
import model.Vestiging;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Auto auto1 = new Auto("Tesla", "S 100D", 2019, 12646, "TR-264-X");
        Auto auto2 = new Auto("Dacia", "Logan MPV", 2017, 46367, "KS-567-W");
        Auto auto3 = new Auto("Toyota", "Prius", 2015, 63234, "GG-111-K");
        Auto auto4 = new Auto("Mercedes", "GLA", 2012, 233332, "GG-111-K");
        Auto auto5 = new Auto("Mazda", "Mazda3", 2018, 21323, "GG-111-K");
        // System.out.println(auto1); // Voor het testen van de klasse Auto

        Vestiging vestiging = new Vestiging("Goumere", "Albert Mol");
        vestiging.voegAutoToe(auto1);
        vestiging.voegAutoToe(auto2);
        vestiging.voegAutoToe(auto3);
        vestiging.voegAutoToe(auto4);
        vestiging.voegAutoToe(auto5);
        System.out.println(vestiging);
    }
}
