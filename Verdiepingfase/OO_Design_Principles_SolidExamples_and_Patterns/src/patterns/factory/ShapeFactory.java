package patterns.factory;

public class ShapeFactory {

    //use getShape method to get (a specific) object of type shape
    public static IShape getShape(String shapeType){
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