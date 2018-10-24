package second;

public class Textbook implements Selling, Returnable {
    private String name;
    private double price;

    public Textbook(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setPrice(double price) { this.price = price; }
    public double getPrice() { return price; }

    @Override
    public double getValue() {
        return price * (1 - DISCOUNT);
    }

    @Override
    public double getCharge() {
        return price * (1 - CHARGE);
    }
}
