package pr3;

import java.util.*;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

class Circle extends Shape {
    protected double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);

        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        String s = "";

        s += "Color: " + super.getColor() + ", ";

        s += "Filled: ";

        if (super.isFilled() == true) {
            s += "yes";
        }
        else {
            s += "no";
        }

        s += ", ";

        s += "Radius: " + this.radius + ", ";

        s += "Area: " + this.getArea() + ", ";

        s += "Perimeter: " + this.getPerimeter();

        return s;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;

            if (this.radius != other.radius) return false;

            else if (this.filled != other.filled) return false;

            else if (!this.color.equals(other.color)) return false;

            return true;
        }

        return false;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);

        this.width = width;
        this.length = length;
    }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public String toString() {
        String s = "";

        s += "Color: " + super.getColor() + ", ";

        s += "Filled: ";

        if (super.isFilled() == true) {
            s += "yes";
        }
        else {
            s += "no";
        }

        s += ", ";

        s += "Width: " + this.width + ", ";

        s += "Length: " + this.length + ", ";

        s += "Area: " + this.getArea() + ", ";

        s += "Perimeter: " + this.getPerimeter();

        return s;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;

            if (this.width != other.width) return false;

            else if (this.length != other.length) return false;

            else if (this.filled != other.filled) return false;

            else if (!this.color.equals(other.color)) return false;

            return true;
        }

        return false;
    }
}

class Square extends Rectangle {

    public Square() {}

    public Square(double size) {
        super(size, size);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSide() { return super.width; }
    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }

    public void setLength(double length) {
        super.setLength(length);
    }

    public String toString() {
        String s = "";

        s += "Color: " + super.getColor() + ", ";

        s += "Filled: ";

        if (super.isFilled() == true) {
            s += "yes";
        }
        else {
            s += "no";
        }

        s += ", ";

        s += "Side: " + this.width + ", ";

        s += "Area: " + this.getArea() + ", ";

        s += "Perimeter: " + this.getPerimeter();

        return s;
    }

//    public boolean equals(Object obj) {
//        if (obj instanceof Square) {
//            Square other = (Square) obj;
//
//            return super.equals(other);
//        }
//
//        return false;
//    }

}

public class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double rad = s.nextDouble();

        Circle c = new Circle(rad, "Red", true);

        System.out.println(c);

        double a, b;

        a = s.nextDouble();
        b = s.nextDouble();

        Rectangle r1 = new Rectangle(a, b, "Blue", false);

        System.out.println(r1);

        double d, e;

        d = s.nextDouble();
        e = s.nextDouble();

        Rectangle r2 = new Rectangle(d, e, "Blue", false);

        System.out.println(r2);

        System.out.println(r1.equals(r2));

        double x = s.nextDouble();

        Square sq1 = new Square(x, "Yellow", true);

        System.out.println(sq1);

        x = s.nextDouble();

        Square sq2 = new Square(x, "Green", true);

        System.out.println(sq2);

        System.out.println(sq1.equals(sq2));

    }
}