package model;

public class SnelheidsBoete extends VerkeersBoete {
    private int gemetenSnelheid;
    private int maximumSnelheid;

    public SnelheidsBoete(int gemetenSnelheid, int maximumSnelheid) {
        this.gemetenSnelheid = gemetenSnelheid;
        this.maximumSnelheid = maximumSnelheid;
        bepaaldBedrag();

    }

    public SnelheidsBoete(String naamDader, String kentekenAuto, int gemetenSnelheid, int maximumSnelheid) {
        super(naamDader, kentekenAuto);
        this.gemetenSnelheid = gemetenSnelheid;
        this.maximumSnelheid = maximumSnelheid;
        bepaaldBedrag();
    }

    public int getGemetenSnelheid() {
        return gemetenSnelheid;
    }

    public void setGemetenSnelheid(int gemetenSnelheid) {
        this.gemetenSnelheid = gemetenSnelheid;
    }

    public int getMaximumSnelheid() {
        return maximumSnelheid;
    }

    public void setMaximumSnelheid(int maximumSnelheid) {
        this.maximumSnelheid = maximumSnelheid;
    }

    public void bepaaldBedrag() {
        int diffSnel = getGemetenSnelheid() - getMaximumSnelheid();
        if (diffSnel > 0 && diffSnel <= 10) {
            super.setBedrag(diffSnel * 10);
        } else if (diffSnel > 10 && diffSnel <= 30) {
            super.setBedrag(diffSnel * 15);
        } else {
            super.setBedrag(Math.min(diffSnel * 20, 1000));
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("Verkeersboete", "SnelheidsBoete") + " voor " + getGemetenSnelheid() + " km/u waar " + getMaximumSnelheid() + " km/u is toegestaan.";
    }
}
