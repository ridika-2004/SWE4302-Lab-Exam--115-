package tst;

import src.Order;
import org.junit.jupiter.api.Test;
import src.IceCream;
import src.Topping;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest1 {

    @Test
    public void testAddMultipleIceCreamsAndToppings() {
        Order order = new Order();

        IceCream iceCream1 = new IceCream("Mint Chocolate Chip", 2.80);
        IceCream iceCream2 = new IceCream("Chocolate Fudge", 3.00);
        Topping topping1 = new Topping("Sprinkles", 0.30);
        Topping topping2 = new Topping("Crushed Oreo", 0.85);

        order.addIceCream(iceCream1, 2);
        order.addIceCream(iceCream2, 3);
        order.addTopping(topping1, 1);
        order.addTopping(topping2, 2);

        double subTotal = order.calculateSubTotal();
        double expectedSubTotal = (2 * 2.80) + (3 * 3.00) + (1 * 0.30) + (2 * 0.85);

        assertEquals(expectedSubTotal, subTotal, 0.01);
    }
}
