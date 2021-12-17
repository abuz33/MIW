package patterns.abstractfactory;


import java.awt.*;

public abstract class AbstractFactory {
    public abstract IShape getShape(String shapeType) ;
}




/*
NOTE: this is a simple example where both factories return objects of the same type.
You can have an abstractfactory with more methods, returning more types. In that case,
the factories could return different types of objects.
 */