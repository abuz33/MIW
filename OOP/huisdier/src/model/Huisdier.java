package model;

public abstract class Huisdier extends Object{
    private String naam;

    public Huisdier(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    protected void setNaam(String naam) {
        this.naam = naam;
    }

    public abstract void maakGeluid();

    @Override
    public String toString() {
        return "Huisdier{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
