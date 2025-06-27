public class OrderProcessor {
    public void processOrder(Order order) {
        // Validação
        if (order == null) throw new IllegalArgumentException();
        if (order.getItems().isEmpty()) throw new IllegalStateException();
        
        // Cálculos
        double subtotal = 0;
        for (Item item : order.getItems()) {
            subtotal += item.getPrice() * item.getQuantity();
        }
        double tax = subtotal * 0.2;
        double total = subtotal + tax;
        
        // Atualização de estoque
        for (Item item : order.getItems()) {
            Inventory.decrease(item.getProductId(), item.getQuantity());
        }
        
        // Notificação
        EmailService.send(order.getCustomerEmail(), "Seu pedido foi processado");
        
        // Persistência
        Database.save(order);
    }
}