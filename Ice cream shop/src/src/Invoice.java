package src;

import javax.management.StringValueExp;
import java.io.FileWriter;
import java.io.IOException;

public class Invoice {
    FileWriter writer = new FileWriter("invoice.txt");
    private static double tax = 0.08;

    public Invoice(Order order) throws IOException {
        writer.write("Ice Cream Shop Invoice\n");
        IceCream iceCream1 = new IceCream("Chocolate Fudge", 3.00);
        int times1 = 1;
        order.addIceCream(iceCream1,times1);
        writer.write(iceCream1.getFlavorName()+" - "+times1+" scoop : "+iceCream1.getPricePerScoop()*times1+"\n");
        IceCream iceCream2 = new IceCream("Mint Chocolate Chip", 2.80);
        order.addIceCream(iceCream2,1);
        writer.write(iceCream2.getFlavorName()+" - "+times1+" scoop : "+iceCream2.getPricePerScoop()*times1+"\n");

        Topping topping1 = new Topping("Chocolate Chips", 0.50);
        order.addTopping(topping1, times1);
        writer.write(topping1.getToppingName()+" - "+times1+" time : "+topping1.getPrice()*times1+"\n");
        Topping topping2 = new Topping("Fresh Strawberries", 0.50);
        int times2 =2;
        order.addTopping(topping2, times2);
        writer.write(topping2.getToppingName()+" - "+times2+" time : "+topping2.getPrice()*times1+"\n");

        writer.write("Subtotal : "+order.calculateSubTotal()+"\n");
        writer.write("Tax : "+order.calculateSubTotal()*tax+"\n");
        writer.write("Total amount due: "+order.calculateTotal()+"\n");

    }
}
