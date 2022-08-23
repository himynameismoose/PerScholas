package sba;

import java.text.DecimalFormat;
import java.util.HashMap;

public class CartSystem extends TheSystem {

    private final HashMap<String, Item> itemCollection;

    CartSystem() {
        itemCollection = getItemCollection();
    }

    @Override
    public void display() {
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println();
        System.out.println("Cart:");
        System.out.printf("%-20s %-20s %-10s %-10s %-10s", "Name", "Description", "Price", "Quantity", "Sub Total");
        System.out.println();

        // Subtotal
        double subtotal = 0;
        for (Item item : itemCollection.values()) {

            String name = item.getItemName();
            name = String.format("%-20s", name);
            String desc = item.getItemDesc();
            desc = String.format("%-20s", desc);
            String price = df.format(item.getItemPrice());
            price = String.format("%-10s", price);
            String quantity = item.getQuantity().toString();
            quantity = String.format("%-10s", quantity);
            Double itemsubtotal = item.getQuantity() * item.getItemPrice();
            String sts = String.format("%-10s", df.format(itemsubtotal));
            System.out.println(name + " " + desc + " " + price + " " + quantity + " " + sts);
            subtotal += itemsubtotal;
        }

        Double tax = subtotal * 0.05;
        Double total = tax + subtotal;

        System.out.printf("%-20s", "Pre-tax Total");
        System.out.println(" " + String.format("%-20s", df.format(subtotal)));
        System.out.printf("%-20s", "Tax");
        System.out.printf(" " + "%-20s%n", df.format(tax));
        System.out.printf("%-20s", "Total");
        System.out.printf(" " + "%-20s%n", df.format(total));
    }
}
