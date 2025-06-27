// Uma mudança requer modificar várias classes
public class Order {
    private double subtotal;
    private double taxRate = 0.2;
    
    public double calculateTax() {
        return subtotal * taxRate;
    }
}

public class Invoice {
    private double subtotal;
    private double taxRate = 0.2;
    
    public double calculateTax() {
        return subtotal * taxRate;
    }
}

public class Report {
    private double subtotal;
    private double taxRate = 0.2;
    
    public double calculateTax() {
        return subtotal * taxRate;
    }
}