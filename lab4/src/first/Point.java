package first;

public class Point implements Shape {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) { this.x = x; }
    public double getX() { return this.x; }

    public void setY(double y) { this.y = y; }
    public double getY() { return this.y; }

    @Override
    public double surArea() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s: x = %.2f, y = %.2f, surface area = %.2f, volume = %.2f",
                getClass() , x, y, surArea(), volume());
    }
}
