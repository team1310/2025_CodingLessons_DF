package hello;

public class ShapeTester {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());

        Rectangle r1 = new Rectangle();
        System.out.println("The default rectangle area is " + r1.getArea());

        Shape square1 = new Rectangle(3, 3);
        System.out.println("The area of the square is " + square1.getArea());

        Shape square2 = new Rectangle(4);
        System.out.println("The area of the square is " + square2.getArea() + " and the perimeter is " + square2.getPerimeter());

    }
}
