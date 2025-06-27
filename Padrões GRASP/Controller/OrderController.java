public class OrderController {
    private OrderService orderService;
    private PaymentService paymentService;
    private NotificationService notificationService;
    
    public void placeOrder(OrderRequest request) {
        Order order = orderService.createOrder(request);
        paymentService.processPayment(order);
        notificationService.sendConfirmation(order);
    }
}