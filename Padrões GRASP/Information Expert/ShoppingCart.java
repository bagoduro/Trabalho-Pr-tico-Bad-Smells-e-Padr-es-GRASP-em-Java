public class ShoppingCart {
    private List<Item> items;
    
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}

public class Item {
    private String productId;
    private String name;
    private double price;
    private int quantity;
    
    // Getters
    public double getSubtotal() {
        return price * quantity;
    }
}