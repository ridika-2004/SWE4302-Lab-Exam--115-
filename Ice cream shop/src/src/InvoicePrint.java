package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InvoicePrint {

    public void printInvoice() {
        try (BufferedReader reader = new BufferedReader(new FileReader("invoice.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading invoice file: " + e.getMessage());
        }
    }
}
