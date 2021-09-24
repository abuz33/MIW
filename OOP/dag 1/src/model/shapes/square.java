package model.shapes;

public class square extends Point {
    int side;

    public square() {
    }

    public square(int leftTopX, int leftTopY) {
        this.X = leftTopX;
        this.Y = leftTopY;
    }

    public square(int leftTopX, int leftTopY, int side) {
        this.X = leftTopX;
        this.Y = leftTopY;
        this.side = side;
    }

    public int calcArea() {
        return side * side;
    }

    public int calcCircumference() {
        return 4 * side;
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

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
