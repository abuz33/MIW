package model;

public class Score {
    private Vak vak;
    private double cijfer;
    private int behaaldePunten;

    public Score(Vak vak, double cijfer) {
        this.vak = vak;
        this.cijfer = cijfer;
        if (this.cijfer >= vak.getCesuur()) {
            this.behaaldePunten = (int) this.vak.getPunten();
        } else this.behaaldePunten = 0;
    }

    public Vak getVak() {
        return vak;
    }

    public double getCijfer() {
        return cijfer;
    }

    public int getBehaaldePunten() {
        return behaaldePunten;
    }
}
