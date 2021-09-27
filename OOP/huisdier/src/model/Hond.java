package model;

public class Hond extends Huisdier{
    private boolean isGevaarlijk;

    public Hond(String naam, boolean isGevaarlijk) {
        super(naam);
        this.isGevaarlijk = isGevaarlijk;
    }

    @Override
    public void maakGeluid() {
        System.out.println("Woef!");
    }

    public void verhuisNaarNieuweBaas(String nieuweNaam){
        super.setNaam(nieuweNaam);
    }

    @Override
    public String toString() {
        return "Hond{" +
                "isGevaarlijk=" + isGevaarlijk + ", parent:" + super.toString()+
                '}';
    }
}
