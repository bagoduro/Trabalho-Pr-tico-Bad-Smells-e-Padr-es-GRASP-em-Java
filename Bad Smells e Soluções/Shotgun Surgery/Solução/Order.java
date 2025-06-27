public class TaxCalculator {
    private static final double TAX_RATE = 0.2;
    
    public static double calculateTax(double subtotal) {
        return subtotal * TAX_RATE;
    }
}

public class Order {
    private double subtotal;
    
    public double calculateTax() {
        return TaxCalculator.calculateTax(subtotal);
    }
}

public class Invoice {
    private double subtotal;
    
    public double calculateTax() {
        return TaxCalculator.calculateTax(subtotal);
    }
}

public class Report {
    private double subtotal;
    
    public double calculateTax() {
        return TaxCalculator.calculateTax(subtotal);
    }
}