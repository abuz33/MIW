package shapes;

public class Point {
    int X;
    int Y;

    public Point() {
        this(0,0);
    }

    public Point(int leftTopX, int leftTopY) {
        this.X = leftTopX;
        this.Y = leftTopY;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "leftTopX=" + X +
                ", leftTopY=" + Y +
                '}';
    }
}
