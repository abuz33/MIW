package solid.openclosed.solution;

public class Rectangle extends Shape {
    double height,width;

    @Override
    double calculateArea() {
        return height*width;
    }
}
