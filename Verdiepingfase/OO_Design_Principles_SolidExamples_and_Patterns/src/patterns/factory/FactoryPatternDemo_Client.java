package patterns.factory;

/**
 * this code uses a factory containing a factory method, to create certain
 * objects which are implementations of the IShape interface.
 * So, it's a bit more elaborate than shown in the factory_implementation.gif
 */
public class FactoryPatternDemo_Client {


    public static void main(String[] args) {

        //get an object of Circle and call its draw method.
        IShape shape1 = ShapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        IShape shape2 = ShapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        IShape shape3 = ShapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}
