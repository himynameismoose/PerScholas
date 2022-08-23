package sba;

public class Item{
    
    private String itemName;            // Name of the item
    private String itemDesc;            // Contains the item's description  
    private Double itemPrice;           // Contains a double value which represents the item's price
    private Integer quantity;           // Represents the number of items the user added to the cart
    private Integer availableQuantity;  // Represents the number of items of a type available in system
    
    
    public Item() {
        quantity = 1;
    }
    
    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
        this();
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemPrice = itemPrice;
        this.availableQuantity = availableQuantity;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public String getItemDesc() {
        return itemDesc;
    }
    
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
    
    public Double getItemPrice() {
        return itemPrice;
    }
    
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }
    
    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
