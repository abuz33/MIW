package model;

public class VerkeersBoete {
    private String naamDader;
    private String kentekenAuto;
    private double bedrag;

    public VerkeersBoete() {
    }

    public VerkeersBoete(String naamDader, String kentekenAuto) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
    }

    public VerkeersBoete(String naamDader, String kentekenAuto, double bedrag) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
        this.bedrag = bedrag;
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    @Override
    public String toString() {
        return "Verkeersboete voor " + this.naamDader + ", kenteken " + this.kentekenAuto + ", " + this.bedrag + " euro";
    }
}
