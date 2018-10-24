package first;

public class Cylinder implements Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return this.radius; }

    public void setHeight(double height) { this.height = height; }
    public double getHeight() { return this.height; }

    @Override
    public double surArea() {
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }

    @Override
    public String toString() {
        return String.format("%s: radius = %.2f, height = %.2f, surface area = %.2f, volume = %.2f",
                getClass(), radius, height, surArea(), volume());
    }
}
