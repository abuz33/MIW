package model;

public class ParkeerBoete extends VerkeersBoete {
    private int zone;
    final static double ZONE_1 = 60;
    final static double ZONE_2 = 100;
    final static double ZONE_3 = 180;

    public ParkeerBoete(int zone) {
        this.zone = zone;
        bepaaldBedrag();
    }

    public ParkeerBoete(String naamDader, String kentekenAuto, int zone) {
        super(naamDader, kentekenAuto);
        this.zone = zone;
        bepaaldBedrag();
    }

    public void bepaaldBedrag() {
        switch (this.zone) {
            case 1:
                super.setBedrag(ZONE_1);
                break;
            case 2:
                super.setBedrag(ZONE_2);
                break;
            case 3:
                super.setBedrag(ZONE_3);
                break;
        }
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return super.toString().replace("Verkeersboete", "Parkeerboete") + "in zone " + getZone();
    }
}
