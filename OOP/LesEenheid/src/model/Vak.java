package model;

public class Vak extends LesEenheid {
    private double cijfer;

    public Vak(double cijfer, String naam, int ects, int studieJaar) {
        super(naam, ects, studieJaar);
        this.cijfer = cijfer;
    }


    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }

    public void isAfgerond() {
    }

    @Override
    public String toString() {
        return super.toString() + ", cijfer " + cijfer;
    }
}
