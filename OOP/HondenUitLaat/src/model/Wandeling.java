package model;

import java.time.LocalDate;

public class Wandeling {
    private Hond walkHond;
    private LocalDate walkDate;
    private double duur;
    private Medewerker walkMedewerker;

    public Wandeling(Hond walkHond, LocalDate walkDate, double duur, Medewerker walkMedewerker) {
        super();
        this.walkHond = walkHond;
        this.walkDate = walkDate;
        this.duur = duur;
        this.walkMedewerker = walkMedewerker;
    }

    public Hond getWalkHond() {
        return walkHond;
    }

    public void setWalkHond(Hond walkHond) {
        this.walkHond = walkHond;
    }

    public LocalDate getWalkDate() {
        return walkDate;
    }

    public void setWalkDate(LocalDate walkDate) {
        this.walkDate = walkDate;
    }

    public double getDuur() {
        return duur;
    }

    public void setDuur(double duur) {
        this.duur = duur;
    }

    public Medewerker getWalkMedewerker() {
        return walkMedewerker;
    }

    public void setWalkMedewerker(Medewerker walkMedewerker) {
        this.walkMedewerker = walkMedewerker;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(walkHond.toString());
        result.append(" uitgelaten op ");
        result.append(walkDate);
        result.append(" gedurende ").append(duur).append(" uur");
        result.append(" door ").append(walkMedewerker.toString());
        return result.toString();
    }

}
