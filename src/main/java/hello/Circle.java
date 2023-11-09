package hello;

public class Circle extends Shape {

    private static final double PI = 3.14;

    private double              radius;

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public double getPerimeter() {
        return getCircumference();
    }
}
