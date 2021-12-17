package solid.liskov.solution;

public class Rectangle extends Square{
    private int side2; // breedte

    public void setHeight(int h){
        this.setSide(h);

    }

    public void setWidth(int w){
        this.side2=w;

    }

    @Override
    public void setSide(int side) {
        super.setSide(side);
        this.side2 = side;
    }

    public int area(){
        return this.getSide()*this.side2;
    }
}
