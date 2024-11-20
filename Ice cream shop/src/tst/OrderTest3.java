package tst;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.Order;
import src.IceCream;
import src.Topping;

public class OrderTest3 {
    @Test
    public void testCalculateTotal() {
        Order order = new Order();

        IceCream iceCream1 = new IceCream("Mint Chocolate Chip", 2.80);

        order.addIceCream(iceCream1, 2);

        double subTotal = order.calculateSubTotal();
        double expectedSubTotal = (2 * 2.80);

        assertEquals(expectedSubTotal, subTotal, 0.01);
    }
}
