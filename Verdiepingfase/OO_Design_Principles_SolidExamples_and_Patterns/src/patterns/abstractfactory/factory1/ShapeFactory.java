package patterns.abstractfactory.factory1;

import patterns.abstractfactory.AbstractFactory;
import patterns.abstractfactory.IShape;
import patterns.abstractfactory.factory1.Circle;
import patterns.abstractfactory.factory1.Rectangle;
import patterns.abstractfactory.factory1.Square;

public class ShapeFactory extends AbstractFactory {

    //use getShape method to get object of type shape
    public IShape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}

/*
NOTE: using an enum to specify type is also really good.
 */