package model.Voetbalscores;

public class Wedstrijd {
    String naamTegenstander;
    int voorDoelpunten;
    int tegenDoelpunten;

    public Wedstrijd() {
        this("Onbekend", 0, 0);
    }

    public Wedstrijd(String naamTegenstander) {
        this.naamTegenstander = naamTegenstander;
    }

    public Wedstrijd(String naamTegenstander, int voorDoelpunten, int tegenDoelpunten) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = voorDoelpunten;
        this.tegenDoelpunten = tegenDoelpunten;
    }

    int bepaalWedstrijdPunten() {
        if (this.voorDoelpunten > this.tegenDoelpunten) return 3;
        else if (this.voorDoelpunten == this.tegenDoelpunten) return 1;
        return 0;
    }

    public void printUitslag() {
        System.out.printf("Uitslag van de wedstrijd tegen %s: %s-%s\n", this.naamTegenstander, this.voorDoelpunten, this.tegenDoelpunten);
    }

    public void printWedstrijdPunten() {
        System.out.printf("Dit levert %s wedstrijdpunten op.", bepaalWedstrijdPunten());
    }
}
