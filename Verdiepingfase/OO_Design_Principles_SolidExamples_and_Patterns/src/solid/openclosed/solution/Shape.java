package solid.openclosed.solution;

abstract class Shape {

    public static double calculateSumOfAllAreas(Shape[] shapes) {
        double sumArea = 0;
        for(Shape shape:shapes) {
           sumArea += shape.calculateArea();
        }
        return sumArea;
    }


    abstract double calculateArea();
}

