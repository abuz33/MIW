package controller;

import model.kofferslot.Kofferslot;

public class KofferslotLauncher {
    public static void main(String[] args) {
        Kofferslot kf = new Kofferslot();
        kf.volgende();
        kf.setCombinatie('B', 'R', 9);
        kf.volgende();
        kf.setCombinatie('D', 'Z', 9);
        kf.volgende();
        kf.setCombinatie('Z', 'Z', 9);
        kf.volgende();
        kf.setCombinatie('A', 'Z', 9);
        kf.volgende();
    }
}
