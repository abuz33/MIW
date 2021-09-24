package model.shapes;

public class Rectangle extends Point {
    double lengte;
    double breedte;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(int leftTopX, int leftTopY) {
        this(100, 100, leftTopX, leftTopY);
    }

    public Rectangle(int leftTopX, int leftTopY,double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.X = leftTopX;
        this.Y = leftTopY;
    }

    public double oppervlakte() {
        return lengte * breedte;
    }

    public double omtrek() {
        return 2 * (lengte + breedte);
    }

    @Override
    public String toString() {
        return "model.shapes.Rectangle{" +
                "lengte=" + lengte +
                ", breedte=" + breedte +
                ", leftTopX=" + X +
                ", leftTopY=" + Y +
                '}';
    }


}
