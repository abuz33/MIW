package controller;

public class Rectangle {
    double lengte;
    double breedte;
    int leftTopX;
    int leftTopY;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(int leftTopX, int leftTopY) {
        this(100, 100, leftTopX, leftTopY);
    }

    public Rectangle(int leftTopX, int leftTopY,double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.leftTopX = leftTopX;
        this.leftTopY = leftTopY;
    }

    public double oppervlakte() {
        return lengte * breedte;
    }

    public double omtrek() {
        return 2 * (lengte + breedte);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lengte=" + lengte +
                ", breedte=" + breedte +
                ", leftTopX=" + leftTopX +
                ", leftTopY=" + leftTopY +
                '}';
    }


}
