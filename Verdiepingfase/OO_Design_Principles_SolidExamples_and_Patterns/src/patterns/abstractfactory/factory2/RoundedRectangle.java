package patterns.abstractfactory.factory2;


import patterns.abstractfactory.IShape;

public class RoundedRectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}