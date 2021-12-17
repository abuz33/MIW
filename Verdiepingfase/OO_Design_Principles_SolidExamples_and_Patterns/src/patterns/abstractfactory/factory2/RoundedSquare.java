package patterns.abstractfactory.factory2;


import patterns.abstractfactory.IShape;

public class RoundedSquare implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}