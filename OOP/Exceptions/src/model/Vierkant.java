package model;

public class Vierkant {
    private int zijde;

    public Vierkant(int zijde) {
        this.zijde = zijde;
    }

    public int getZijde() {
        return zijde;
    }

    public void setZijde(int zijde) {
        this.zijde = zijde;
    }

    @Override
    public String toString() {
        return String.format("Dat is een vierkant en een zijde is %s cm. En oppervlakte van de vierkant is %s.", getZijde(), getOppervlakte());
    }

    public int getOppervlakte() {
        return (int) Math.pow(zijde, 2);
    }

    public static double berekenZijde(double oppervlakte) throws IllegalArgumentException{
        if (oppervlakte <=0){
            throw new IllegalArgumentException("Oppervlakte kunt niet kleiner dan 0");
        }
        return Math.sqrt(oppervlakte);
    }
}
