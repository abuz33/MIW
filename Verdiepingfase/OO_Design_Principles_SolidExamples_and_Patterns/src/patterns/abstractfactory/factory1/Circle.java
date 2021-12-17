package patterns.abstractfactory.factory1;

import patterns.abstractfactory.IShape;

public class Circle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}