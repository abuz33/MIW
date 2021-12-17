package patterns.abstractfactory.factory2;

import patterns.abstractfactory.AbstractFactory;
import patterns.abstractfactory.IShape;

public class RoundedShapeFactory extends AbstractFactory {

    //use getShape method to get object of type shape
    public IShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new RoundedCircle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }

        return null;
    }
}

/*
NOTE: using an enum to specify type is also really good.
 */
