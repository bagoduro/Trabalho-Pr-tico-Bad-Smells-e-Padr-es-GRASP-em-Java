public class OrderProcessor {
    // A classe é modificada por diferentes razões
    public void process(Order order) {
        // Lógica de processamento
        if (order.getPaymentMethod() == PaymentMethod.CREDIT_CARD) {
            processCreditCard(order);
        } else if (order.getPaymentMethod() == PaymentMethod.PAYPAL) {
            processPayPal(order);
        }
        
        // Lógica de notificação
        if (order.getCustomer().getNotificationPreference() == NotificationPreference.EMAIL) {
            sendEmail(order);
        } else if (order.getCustomer().getNotificationPreference() == NotificationPreference.SMS) {
            sendSMS(order);
        }
    }
    
    // ... métodos de processamento e notificação
}