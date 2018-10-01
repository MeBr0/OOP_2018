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

    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

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

public class pr2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cylinder cyl = new Cylinder(2, 3);

        cyl.findSurArea();
        cyl.findVolume();

        System.out.println(cyl);
    }
}