package patterns.mvc;

public enum TrafficLight {
    RED("rood"),YELLOW("geel"),GREEN("groen");

    private String kleur;

    TrafficLight(String kleur) {
        this.kleur = kleur;
    }

    @Override
    public String toString() {
        return kleur ;
    }
}
