package tst;

import src.Order;
import org.junit.jupiter.api.Test;
import src.IceCream;
import src.Topping;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest4 {

    @Test
    public void testAddMultipleIceCreamsAndToppings() {
        Order order = new Order();

        IceCream iceCream1 = new IceCream("Mint Chocolate Chip", 2.80);
        Topping topping2 = new Topping("Crushed Oreo", 0.85);

        order.addIceCream(iceCream1, 2);
        order.addTopping(topping2, 2);

        double subTotal = order.calculateSubTotal();
        double expectedSubTotal = (2 * 2.80) + (2 * 0.85);

        assertEquals(expectedSubTotal, subTotal, 0.01);
    }
}
