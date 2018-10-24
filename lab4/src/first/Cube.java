package first;

public class Cube implements Shape {
    private double length;

    public Cube(double length) {
        this.length = length;
    }

    public void setLength(double length) { this.length = length; }
    public double getLength() { return this.length; }

    @Override
    public double surArea() {
        return 6 * Math.pow(this.length, 2);
    }

    @Override
    public double volume() {
        return Math.pow(this.length, 3);
    }

    @Override
    public String toString() {
        return String.format("%s: length = %.2f, surface area = %.2f, volume = %.2f",
                getClass(), length, surArea(), volume());
    }
}
