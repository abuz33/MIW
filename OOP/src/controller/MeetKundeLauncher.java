package controller;

import model.Cirkel;

public class MeetKundeLauncher {
    public static void main(String[] args) {
        Cirkel mijnEersteCirkel = new Cirkel();
        mijnEersteCirkel.straal = 3;
        mijnEersteCirkel.middelpuntX = 3;
        mijnEersteCirkel.middelpuntY = -2;
        mijnEersteCirkel.kleur = "groen";
        System.out.println(mijnEersteCirkel.geefOmtrek());
        System.out.println(mijnEersteCirkel.geefOppervlakte());

        Cirkel circle2 = new Cirkel(6);
        System.out.println(circle2.geefOmtrek());
        System.out.println(circle2.geefOppervlakte());

        Cirkel mijnAllArgsCirkel = new Cirkel(3, 1, 4, "groen");
        System.out.println(mijnAllArgsCirkel.geefOmtrek());
        System.out.println(mijnAllArgsCirkel.geefOppervlakte());
        Cirkel mijnDefaultCirkel = new Cirkel();
        System.out.println(mijnDefaultCirkel.geefOmtrek());
        System.out.println(mijnDefaultCirkel.geefOppervlakte());
        Cirkel mijnStraalCirkel = new Cirkel(6);
        System.out.println(mijnStraalCirkel.geefOmtrek());
        System.out.println(mijnStraalCirkel.geefOppervlakte());

        System.out.println("👉 "+ Cirkel.geefDefinitie());
    }

}
