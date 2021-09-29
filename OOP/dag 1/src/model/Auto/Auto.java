package model.Auto;

public class Auto extends Voertuig {
    private String soortBrandstof;
    protected static final int AANTAL_WIELEN = 4;


    public Auto(String merk, String type, int gewicht, String soortBrandstof) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.soortBrandstof = soortBrandstof;
    }


    @Override
    public String geefAandrijfkracht() {
        return (this.soortBrandstof + " motor ");
    }
}
