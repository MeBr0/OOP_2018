package first;

public class Sphere implements Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }

    @Override
    public double surArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double volume() {
        return 4 * Math.PI * Math.pow(this.radius, 3) / 3;
    }

    @Override
    public String toString() {
        return String.format("%s: radius = %.2f, surface area = %.2f, volume = %.2f",
                getClass(), radius, surArea(), volume());
    }
}
