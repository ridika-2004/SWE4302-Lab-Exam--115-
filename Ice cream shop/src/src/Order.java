package src;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<IceCream> iceCreams = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();
    private boolean isWaffleCone;
    private static double tax = 0.08;
    private static double waffleCone = 5.00;
    public void addIceCream(IceCream iceCream, int scoops) {
        for (int i = 0; i < scoops; i++) {
            iceCreams.add(iceCream);
        }
    }

    public void addTopping(Topping topping, int quantity) {
        for (int i = 0; i < quantity; i++) {
            toppings.add(topping);
        }
    }

    public void chooseCone(boolean isWaffleCone) {
        this.isWaffleCone = isWaffleCone;
    }

    public double calculateSubTotal() {
        double total = iceCreams.stream().mapToDouble(IceCream::getPricePerScoop).sum();
        total += toppings.stream().mapToDouble(Topping::getPrice).sum();
        if (isWaffleCone) total += waffleCone;
        return total;
    }

    public double calculateTotal() {
        double total = iceCreams.stream().mapToDouble(IceCream::getPricePerScoop).sum();
        total += toppings.stream().mapToDouble(Topping::getPrice).sum();
        if (isWaffleCone) total += waffleCone;
        return total + (total * tax);
    }
}
