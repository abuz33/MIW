package model;

public class LesEenheid {
    private String naam;
    private int ects;
    private int studieJaar;

    public LesEenheid(String naam, int ects, int studieJaar) {
        this.naam = naam;
        this.ects = ects;
        this.studieJaar = studieJaar;
    }

    @Override
    public String toString() {
        return String.format("%s, %s ects, studiejaar %s", naam, ects, studieJaar);
    }
}
