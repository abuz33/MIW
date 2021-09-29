package model;

public abstract  class Vaartuig extends Vervoermiddel {
    private double lengteInMeter;

    protected Vaartuig(String merk, String type, double lengteInMeter) {
        super(merk, type);
        this.lengteInMeter = lengteInMeter;
    }

}
