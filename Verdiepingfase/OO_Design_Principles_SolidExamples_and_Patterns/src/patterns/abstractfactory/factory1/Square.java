package patterns.abstractfactory.factory1;

import patterns.abstractfactory.IShape;

public class Square implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}