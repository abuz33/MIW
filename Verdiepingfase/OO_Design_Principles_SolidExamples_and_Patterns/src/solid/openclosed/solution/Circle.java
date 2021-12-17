package solid.openclosed.solution;

public class Circle extends Shape {
    double radius;

    @Override
    double calculateArea() {
        return radius*radius*Math.PI;
    }
}
