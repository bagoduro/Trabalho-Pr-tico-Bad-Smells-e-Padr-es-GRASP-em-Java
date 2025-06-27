public class OrderProcessor {
    public void processOrder(Order order) {
        double total = calculateTotal(order);
        // Processamento do pedido...
    }
    
    public void generateInvoice(Order order) {
        double total = calculateTotal(order);
        // Geração da fatura...
    }
    
    private double calculateTotal(Order order) {
        double tax = order.getSubtotal() * 0.2;
        return order.getSubtotal() + tax;
    }
}