package second;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius, String color, boolean isFilled) {
        super(color, isFilled);

        this.radius = radius;
    }

    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }

    @Override
    public double surArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    public String toString() {
        return String.format("%s: radius = %.2f, surface area = %.2f, volume = %.2f, color = %s, filled = %b",
                getClass(), radius, surArea(), volume(), getColor(), isFilled());
    }
}
