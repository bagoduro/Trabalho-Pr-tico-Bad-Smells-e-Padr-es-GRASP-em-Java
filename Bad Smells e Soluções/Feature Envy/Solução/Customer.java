public class Customer {
    // ... outros métodos
    
    public String generateReport() {
        return "Report for: " + this.firstName + " " + this.lastName 
             + "\nEmail: " + this.email 
             + "\nPhone: " + this.phoneNumber
             + "\nTotal Orders: " + this.orders.size();
    }
}

public class ReportGenerator {
    public String generateCustomerReport(Customer customer) {
        return customer.generateReport();
    }
}