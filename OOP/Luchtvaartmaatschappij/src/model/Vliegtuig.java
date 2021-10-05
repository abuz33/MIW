package model;

public class Vliegtuig {
    private int registratieNummer;
    private String type;

    public Vliegtuig() {
    }

    public Vliegtuig(int registratieNummer, String type) {
        this.registratieNummer = registratieNummer;
        this.type = type;
    }

    public int getRegistratieNummer() {
        return registratieNummer;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vliegtuig{" +
                "registratieNummer=" + registratieNummer +
                ", type='" + type + '\'' +
                '}';
    }
}
