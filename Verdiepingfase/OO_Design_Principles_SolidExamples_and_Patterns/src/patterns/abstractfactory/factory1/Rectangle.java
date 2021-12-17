package patterns.abstractfactory.factory1;

import patterns.abstractfactory.IShape;

public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

