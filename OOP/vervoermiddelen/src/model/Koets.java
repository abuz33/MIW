package model;

public class Koets extends Voertuig {
    private int aantalPaarden;
    protected static int AANTAL_WIELEN = 4;

    public Koets(String merk, String type, int gewicht, int aantalPaarden) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.aantalPaarden = aantalPaarden;
    }

    @Override
    public String geefAandrijfkracht() {
        return (this.aantalPaarden + " paarden");
    }
}
