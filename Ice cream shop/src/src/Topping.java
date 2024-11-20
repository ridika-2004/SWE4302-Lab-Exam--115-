package src;

public class Topping {
    private String toppingName;
    private double price;

    public Topping(String toppingName, double price) {
        this.toppingName = toppingName;
        this.price = price;
    }

    public String getToppingName() { return toppingName; }
    public double getPrice() { return price; }
}
