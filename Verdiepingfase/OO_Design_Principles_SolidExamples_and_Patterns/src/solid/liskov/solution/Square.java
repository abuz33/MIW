package solid.liskov.solution;

public class Square  {
private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int area(){
        return this.side*this.side;
    }
}
