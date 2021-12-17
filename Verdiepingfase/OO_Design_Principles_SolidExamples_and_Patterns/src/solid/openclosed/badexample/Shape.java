package solid.openclosed.badexample;

class Shape {

    public static double calculateSumOfAllAreas(Shape[] shapes) {
        double sumArea = 0;
        for(Shape shape:shapes) {
            if(shape instanceof Rectangle) {
                //Calculate Area of Rectange
                //sumArea +=
            }
            else if(shape instanceof Circle) {
                //Calculate Area of Circle
                //sumArea +=
            }
        }
        return sumArea;
    }
}

