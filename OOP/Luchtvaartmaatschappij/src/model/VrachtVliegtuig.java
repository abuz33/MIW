package model;

public class VrachtVliegtuig extends Vliegtuig {
    private int maxLading;

    public VrachtVliegtuig(int registratieNummer, String type, int maxLading) {
        super(registratieNummer, type);
        this.maxLading = maxLading;
    }

    public int getMaxLading() {
        return maxLading;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVrachtVliegtuig{" +
                "maxLading=" + maxLading +
                '}';
    }
}
