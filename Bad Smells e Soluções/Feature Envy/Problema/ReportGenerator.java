public class ReportGenerator {
    public String generateCustomerReport(Customer customer) {
        // A classe ReportGenerator está acessando muitos dados de Customer
        return "Report for: " + customer.getFirstName() + " " + customer.getLastName() 
             + "\nEmail: " + customer.getEmail() 
             + "\nPhone: " + customer.getPhoneNumber()
             + "\nTotal Orders: " + customer.getOrders().size();
    }
}