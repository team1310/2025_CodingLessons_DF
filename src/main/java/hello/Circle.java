package hello;

public class Circle {

    private final double PI = 3.14;
    private double       radius;

    public Circle() {
        this.radius = 1;
    }

    public double getArea() {
        double circleArea;

        circleArea = PI * radius * radius;
        return circleArea;
    }

}
