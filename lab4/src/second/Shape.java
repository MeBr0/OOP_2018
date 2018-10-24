package second;

public abstract class Shape {
    private String color;
    private boolean isFilled;

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }

    public void setFilled(boolean filled) { isFilled = filled; }
    public boolean isFilled() { return isFilled; }

    public abstract double surArea();
    public abstract double volume();

    @Override
    public String toString() {
        return String.format("%s: Color: %s, Filled: %b", this.getClass(),color, isFilled);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Shape) {
            Shape other = (Shape) obj;

            if (this.color.equals(other.color)) return this.isFilled == other.isFilled;

            else return false;
        }
        else return false;
    }
}
