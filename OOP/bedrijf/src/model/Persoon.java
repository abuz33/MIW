package model;

public class Persoon {
    public static int aantalPersonen = 0;
    public int personeelsNummer;
    public String naam;
    public String woonplaats;
    public double maandSalaries;

    public Persoon() {
    }

    public Persoon(String naam) {
        this(naam, "Onbekend",0);
    }

    public Persoon(String naam, String woonplaats, double maandSalaries) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaries = maandSalaries;
        this.personeelsNummer = ++aantalPersonen;
    }

    public double berekenJaarInKomen() {
        return 1;
    }
}
