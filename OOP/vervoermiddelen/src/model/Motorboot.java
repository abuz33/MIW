package model;

public class Motorboot extends Vaartuig {
    private String sortBrandstof;

    public Motorboot(String merk, String type, double lengte, String sortBrandstof) {
        super(merk, type, lengte);
        this.sortBrandstof = sortBrandstof;
    }

    @Override
    public String geefAandrijfkracht() {
        return (this.sortBrandstof + "motor");
    }
}
