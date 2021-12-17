package patterns.abstractfactory;

import patterns.abstractfactory.factory1.ShapeFactory;
import patterns.abstractfactory.factory2.RoundedShapeFactory;


public class FactoryProducer {
    public static AbstractFactory getFactory(ShapeType type){
        switch(type){
            case ROUNDED:
            return new RoundedShapeFactory();

            case STRAIGHT:
            return new ShapeFactory();

            default:
                return new ShapeFactory();
        }
    }
}