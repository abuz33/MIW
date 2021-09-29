package model;

public class Fiets extends Voertuig {
    protected static final int AANTAL_WIELEN = 2;

    public Fiets(String merk, String type, int gewicht) {
        super(merk, type, AANTAL_WIELEN, gewicht);
    }

    @Override
    public String geefAandrijfkracht() {
        return "menskracht";
    }
}
