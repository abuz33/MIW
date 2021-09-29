package model;

public class Auto implements Comparable<Auto>{
    private String merk;
    private String model;
    private int jaar;
    private int kilometerstand;
    private String kenteken;

    public Auto(String merk, String model, int jaar, int kilometerstand, String kenteken) {
        this.merk = merk;
        this.model = model;
        this.jaar = jaar;
        this.kilometerstand = kilometerstand;
        this.kenteken = kenteken;
    }

    public int getJaar() {
        return jaar;
    }

    @Override
    public String toString() {
        return String.format("\nMerk: %s\n" +
                "Model: %s\n" +
                "Jaar: %s\n" +
                "Kilometerstand: %s\n" +
                "Kenteken: %s", merk, model, jaar, kilometerstand, kenteken);
    }

    @Override
    public int compareTo(Auto o) {
        return Integer.compare(this.jaar, o.jaar);
    }
}
