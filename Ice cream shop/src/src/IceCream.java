package src;
public class IceCream {
    private String flavorName;
    private double pricePerScoop;

    public IceCream(String flavorName, double pricePerScoop) {
        this.flavorName = flavorName;
        this.pricePerScoop = pricePerScoop;
    }

    public String getFlavorName() { return flavorName; }
    public double getPricePerScoop() { return pricePerScoop; }
}
