package tst;

import src.Order;
import org.junit.jupiter.api.Test;
import src.IceCream;
import src.Topping;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest2 {

    @Test
    public void testAddMultipleIceCreamsAndToppings() {
        Order order = new Order();

        Topping topping1 = new Topping("Sprinkles", 0.30);
        Topping topping2 = new Topping("Crushed Oreo", 0.85);

        order.addTopping(topping1, 1);
        order.addTopping(topping2, 2);

        double subTotal = order.calculateSubTotal();
        double expectedSubTotal = (1 * 0.30) + (2 * 0.85);

        assertEquals(expectedSubTotal, subTotal, 0.01);
    }
}
