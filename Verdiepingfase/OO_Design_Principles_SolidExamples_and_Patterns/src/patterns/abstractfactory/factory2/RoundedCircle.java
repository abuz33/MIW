package patterns.abstractfactory.factory2;


import patterns.abstractfactory.IShape;

public class RoundedCircle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedCircle::draw() method.");
    }
}
