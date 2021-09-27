package model;

public class Cavia extends Huisdier{



    public Cavia(String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        System.out.println("PFWIEEEP");
    }

    @Override
    public String toString() {
        return "Cavia{}";
    }
}
