package model;

public class Persoon {
    private final double GRENSWAARDE_BONUS = 4500;
    public static int aantalPersonen = 0;
    private int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandSalaries;
    private Afdeling afdeling;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Persoon() {
        this("Onbekend", "Onbekend", 0, null);
    }

    public Persoon(String naam) {
        this(naam, "Onbekend", 0, null);
    }

    public Persoon(String naam, String woonplaats, double maandSalaries, Afdeling afdeling) {
        this.afdeling = afdeling;
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaries = maandSalaries;
        aantalPersonen++;
        this.personeelsNummer = aantalPersonen;
    }


    public double berekenJaarInkomen() {
        return 12 * maandSalaries;
    }

    public boolean heeftRechtOpBonus() {
        return maandSalaries > GRENSWAARDE_BONUS;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public void setPersoneelsNummer(int personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public double getMaandSalaries() {
        return maandSalaries;
    }

    public void setMaandSalaries(double maandSalaries) {
        this.maandSalaries = maandSalaries;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "GRENSWAARDE_BONUS=" + GRENSWAARDE_BONUS +
                ", personeelsNummer=" + personeelsNummer +
                ", naam='" + naam + '\'' +
                ", woonplaats='" + woonplaats + '\'' +
                ", maandSalaries=" + maandSalaries +
                '}';
    }
}
