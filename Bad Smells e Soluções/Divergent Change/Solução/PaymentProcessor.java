public class PaymentProcessor {
    public void processPayment(Order order) {
        if (order.getPaymentMethod() == PaymentMethod.CREDIT_CARD) {
            processCreditCard(order);
        } else if (order.getPaymentMethod() == PaymentMethod.PAYPAL) {
            processPayPal(order);
        }
    }
    // ... métodos específicos de pagamento
}

public class NotificationService {
    public void sendNotification(Order order) {
        if (order.getCustomer().getNotificationPreference() == NotificationPreference.EMAIL) {
            sendEmail(order);
        } else if (order.getCustomer().getNotificationPreference() == NotificationPreference.SMS) {
            sendSMS(order);
        }
    }
    // ... métodos específicos de notificação
}