package hello;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle() {
        this.length = 2;
        this.width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double squareSide) {
        this.length = squareSide;
        this.width = squareSide;
    }


    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double newLength) {
        length = newLength;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }

    public double getPerimeter() {
        return length * 2 + width * 2;
    }

}
