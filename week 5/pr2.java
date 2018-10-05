import java.util.Scanner;

abstract class Shape {

    private double volume;
    private double surArea;

    public double getSurArea() { return surArea; }
    public void setSurArea(double surArea) { this.surArea = surArea; }

    public double getVolume() { return volume; }
    public void setVolume(double volume) { this.volume = volume; }

    public abstract void findVolume();
    public abstract void findSurArea();

    public String toString() {
        return "volume: " + String.valueOf(this.volume) + " area: " + String.valueOf(this.surArea);
    }
}

class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius, double height) {
        super();
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public void findVolume() {
        double volume = Math.PI * this.radius * this.radius * this.height;

        super.setVolume(volume);
    }

    public void findSurArea() {
        double surArea = 2 * Math.PI * this.radius * this.height + 2 * Math.PI * this.radius * this.radius;

        super.setSurArea(surArea);
    }

    public String toString() {
        String a = super.toString();

        return "radius: " + String.valueOf(this.radius) + " height: " + String.valueOf(this.height) + " " + a;
    }
}

class Sphere extends Shape {

    private double radius;

    public Sphere() {
        super();
    }

    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public void findVolume() {
        double volume = 4 * Math.PI * this.radius * this.radius * this.radius / 3;

        super.setVolume(volume);
    }

    public void findSurArea() {
        double surArea = 4 * Math.PI * this.radius * this.radius;

        super.setSurArea(surArea);
    }

    public String toString() {
        String a = super.toString();

        return "radius: " + String.valueOf(this.radius) + " " + a;
    }
}

class Cube extends Shape {

    private double length;

    public Cube() {
        super();
    }

    public Cube(double length) {
        super();
        this.length = length;
    }

    public double getLength() { return this.length; }
    public void setLength(double length) { this.length = length; }

    public void findVolume() {
        double volume = this.length * this.length * this.length;

        super.setVolume(volume);
    }

    public void findSurArea() {
        double surArea = 6 * this.length * this.length;

        super.setSurArea(surArea);
    }

    public String toString() {
        String a = super.toString();

        return "length: " + String.valueOf(this.length) + " " + a;
    }
}

public class pr2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cylinder cyl = new Cylinder(2, 3);

        cyl.findSurArea();
        cyl.findVolume();

        System.out.println(cyl);

        Cube cub = new Cube(4);

        cub.findSurArea();
        cub.findVolume();

        System.out.println(cub);

        Sphere sph = new Sphere(5);

        sph.findSurArea();
        sph.findVolume();

        System.out.println(sph);
    }
}