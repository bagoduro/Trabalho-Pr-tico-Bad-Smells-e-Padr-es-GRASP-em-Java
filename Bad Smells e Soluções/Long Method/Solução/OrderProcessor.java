public class OrderProcessor {
    public void processOrder(Order order) {
        validateOrder(order);
        double total = calculateTotal(order);
        updateInventory(order);
        notifyCustomer(order);
        persistOrder(order);
    }
    
    private void validateOrder(Order order) { /* ... */ }
    private double calculateTotal(Order order) { /* ... */ }
    private void updateInventory(Order order) { /* ... */ }
    private void notifyCustomer(Order order) { /* ... */ }
    private void persistOrder(Order order) { /* ... */ }
}