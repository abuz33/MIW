package model;

public class ProfessionalSkills extends LesEenheid {
    private boolean gehaald;

    public ProfessionalSkills(boolean gehald, String naam, int ects, int studieJaar) {
        super(naam, ects, studieJaar);
        this.gehaald = gehald;
    }

    public void setGehaald(boolean gehald) {
        this.gehaald = gehald;
    }

    public void isAfgerond() {
    }

    @Override
    public String toString() {
        return super.toString() + (gehaald ? " gehaald" : " niet gehaald.");
    }
}
