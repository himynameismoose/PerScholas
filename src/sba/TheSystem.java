package sba;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
    
    // Provides the list of items in the system or the cart
    // depending on which class initiates it
    private HashMap<String, Item> itemCollection;
   

    TheSystem() {
        // Initialize itemCollection
        itemCollection = new HashMap<>();
        
        // Check if AppSystem is invoking the constructor
        if (getClass().getSimpleName().equals("AppSystem")) {
            
            try { // Use Scanner to read file
                Scanner scanner = new Scanner(new File("src/sba/sample.txt"));
                
                // Read file line by line
                while (scanner.hasNextLine()) {

                    String line = scanner.nextLine(); // get line
                    String[] itemInfo = line.split(" {2}");  // split the line into array

                    // Create Item
                    Item item = new Item(
                            itemInfo[0],
                            itemInfo[1],
                            Double.parseDouble(itemInfo[2]),
                            Integer.parseInt(itemInfo[3])
                    );

                    itemCollection.put(item.getItemName(), item);
                }

                scanner.close();
                
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    
    public HashMap<String, Item> getItemCollection(){
        return itemCollection;
    }

    public void setItemCollection(HashMap<String, Item> itemCollection) {
        this.itemCollection = itemCollection;
    }
    
    public Boolean checkAvailability(Item item) {

        if (item.getQuantity() >= item.getAvailableQuantity()) {
            System.out.println("System is unable to add " + item.getItemName() + " to the card. " +
                    "System only has " + item.getAvailableQuantity() + ".");

            return false;
        }

        return true;
    }
    
    public Boolean add(Item item) {
        if (item != null) {
            if (itemCollection.containsKey(item.getItemName())) {
                item.setQuantity(item.getQuantity() + 1);
            } else {
                itemCollection.put(item.getItemName(), item);
            }

            return true;
        }

        return false;
    }

    public Item remove(String itemName) {
        Item item = null;
        if (itemCollection.containsKey(itemName)) {
            item = itemCollection.get(itemName);
            itemCollection.remove(itemName);
        }

        return item;
    }

    public abstract void display();
}
