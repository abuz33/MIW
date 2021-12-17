package solid.liskov.badexample;

public class Rectangle {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int widht) {
        this.width = widht;
    }

    public double area(){
        return this.height*this.width;
    }
}
