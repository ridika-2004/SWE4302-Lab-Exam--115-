package tst;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.Order;
import src.IceCream;
import src.Topping;

public class OrderTest {
    @Test
    public void testCalculateTotal() {
            Order order = new Order();

            IceCream iceCream1 = new IceCream("Mint Chocolate Chip", 2.80);
            IceCream iceCream2 = new IceCream("Chocolate Fudge", 3.00);

            order.addIceCream(iceCream1, 2);
            order.addIceCream(iceCream2, 3);

            double subTotal = order.calculateSubTotal();
            double expectedSubTotal = (2 * 2.80) + (3 * 3.00);

            assertEquals(expectedSubTotal, subTotal, 0.01);
        }
}
