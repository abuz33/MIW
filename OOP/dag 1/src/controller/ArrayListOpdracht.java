package controller;

import model.Auto.Auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayListOpdracht {
    public static void main(String[] args) {
        System.out.println(lijstVanWoorden());

        ArrayList<Integer> res = maakRandomRijGetallen(5, 50);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

        int result = somVanRij(res);
        System.out.println(result);

        System.out.println(gemiddeldeVanRij(res));
        lijstVanGetallen();

        ArrayList<Auto> autoLijst = new ArrayList<>();
        autoLijst.add(new Auto("Dacia", "Logan", 1150, "benzine"));
        autoLijst.add(new Auto("Tesla", "S 100D", 2200, "elektrisch"));
        autoLijst.add(new Auto("Fiat", "Ducato", 2700, "diesel"));
        autoLijst.add(new Auto("Citroën", "C1", 2075, "benzine"));
        autoLijst.add(new Auto("Ford", "Focus", 1150, "benzine"));
        autoLijst.add(new Auto("Toyota", "Prius", 1750, "hybride"));
        autoLijst.add(new Auto("Volkswagen", "Golf", 1150, "diesel"));
        autoLijst.add(new Auto("Honda", "Civic", 1075, "benzine"));
        System.out.println(geefZwaarsteAuto(autoLijst));
    }

    private static Auto geefZwaarsteAuto(ArrayList<Auto> autoLijst) {
        int place = 0;
        for (int i = 1; i < autoLijst.size(); i++) {
            if (autoLijst.get(i).getGewicht() > autoLijst.get(place).getGewicht()) place = i;
        }

        return autoLijst.get(place);
    }

    public static String lijstVanWoorden() {
        ArrayList<String> lijst = new ArrayList<>();
        // “Morgen”, “wordt”, “het”, “mooi” en “weer”
        lijst.add("Morgen");
        lijst.add("wordt");
        lijst.add("het");
        lijst.add("mooi");
        lijst.add("weer");

        lijst.remove(1);
        lijst.add(1, "is");
        String message = "";
        for (String woord : lijst) {
            message += " " + woord;
        }
        return message;
    }

    public static ArrayList<Integer> maakRandomRijGetallen(int aantal, int maximum) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < aantal; i++) {
            nums.add(random.nextInt(maximum));
        }
        return nums;
    }

    public static int somVanRij(ArrayList<Integer> rij) {
        int res = 0;
        for (int num : rij) {
            res += num;
        }
        return res;
    }

    public static double gemiddeldeVanRij(ArrayList<Integer> rij) {
        return 1.0 * somVanRij(rij) / rij.size();
    }

    public static double gemiddeldeVanRij2(ArrayList<Number> rij) {
        double som = 0;
        for (Number num : rij) {
            som += num.doubleValue();
        }
        return som / rij.size();
    }

    public static void lijstVanGetallen() {
        ArrayList<Number> rij = new ArrayList<>(Arrays.asList(5, 8, 13, 21, 34, 3.14, 2.72, 1.62));
        double som = 0;
        for (int i = 0; i < rij.size(); i++) {
            if (rij.get(i) instanceof Integer) System.out.println(rij.get(i));
            else if (rij.get(i) instanceof Double) {
                Double num = (Double) rij.get(i);
                som = som + num;
            }
        }
        System.out.println(som);
        System.out.println(gemiddeldeVanRij2(rij));

    }


}
