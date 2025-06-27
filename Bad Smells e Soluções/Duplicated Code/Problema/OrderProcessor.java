public class OrderProcessor {
    public void processOrder(Order order) {
        // Cálculo do imposto duplicado
        double tax = order.getSubtotal() * 0.2;
        double total = order.getSubtotal() + tax;
        
        // Processamento do pedido...
    }
    
    public void generateInvoice(Order order) {
        // Cálculo do imposto duplicado
        double tax = order.getSubtotal() * 0.2;
        double total = order.getSubtotal() + tax;
        
        // Geração da fatura...
    }
}