package sba;

import java.text.DecimalFormat;
import java.util.HashMap;

public class AppSystem extends TheSystem {

    private final HashMap<String, Item> itemCollection;

    AppSystem() {
        itemCollection = getItemCollection();
    }

    @Override
    public void display() {
        DecimalFormat df = new DecimalFormat("#0.00");

        // Display header
        System.out.println("AppSystem Inventory:");

        System.out.printf("%-20s %-20s %-10s %-10s", "Name", "Description", "Price", "Available Quantity\n");

        // Display items
        for (Item item : itemCollection.values()) {

            String name = item.getItemName();
            name = String.format("%-20s", name);
            String desc = item.getItemDesc();
            desc = String.format("%-20s", desc);
            String price = df.format(item.getItemPrice());
            price = String.format("%-10s", price);
            String quantity = item.getAvailableQuantity().toString();
            quantity = String.format("%-10s", quantity);

            System.out.println(name + " " + desc + " " + price + " " + quantity);
        }
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        // Check if item is null
        if (item != null) {
            // Check if item is in collection
            if (!itemCollection.containsValue(item)) {
                itemCollection.put(item.getItemName(), item);

                return true;
            } else {
                System.out.println(item.getItemName() + " is already in the App System");
            }
        }

        return false;
    }

    public Item reduceAvailableQuantity(String item_name) {
        Item item = null;
        // check if item is in collection
        if (itemCollection.containsKey(item_name)) {
            item = itemCollection.get(item_name);
            // Decrease available quantity by 1
            int quantity = item.getAvailableQuantity();
            item.setAvailableQuantity(quantity - 1);

            // Remove item if available quantity is 0
            if (item.getAvailableQuantity() <= 0) {
                itemCollection.remove(item_name);
                return null;
            }
        }

        return item;
    }
}
