package hello;

import java.util.Scanner;

public class InteractiveShapeTester {

    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String... args) {

        System.out.println("Welcome to the interactive shape tester");

        System.out.println("Please provide a radius: ");
        double radius = myScanner.nextDouble();
        Circle c1 = new Circle();
        c1.setRadius(radius);
        System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());

        System.out.println("Let's change it - please provide another radius: ");
        radius = myScanner.nextDouble();
        c1.setRadius(radius);
        System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());

        System.out.println("Creating a second circle...");
        Circle c2 = new Circle();
        System.out.println("Please provide a radius: ");
        radius = myScanner.nextDouble();
        c2.setRadius(radius);
        System.out.println("The area of the circle of radius " + c2.getRadius() + " is " + c2.getArea());
        System.out.println("The area of c1 is " + c1.getArea() + " and the area of c2 is " + c2.getArea());

        Rectangle r1 = new Rectangle();
        System.out.println("The rectangle area is " + r1.getArea());
        System.out.println("Enter a new width: ");
        double width = myScanner.nextDouble();
        r1.setWidth(width);
        System.out.println("Enter a new length: ");
        r1.setLength(myScanner.nextDouble());
        System.out.println("The rectangle area is " + r1.getArea());

    }
}
