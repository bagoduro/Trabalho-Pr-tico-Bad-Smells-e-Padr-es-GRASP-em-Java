// Baixa coesão
public class CustomerManager {
    public void addCustomer(Customer c) { /* ... */ }
    public void sendEmail(Customer c, String msg) { /* ... */ }
    public void generateReport() { /* ... */ }
}

// Alta coesão
public class CustomerRepository {
    public void addCustomer(Customer c) { /* ... */ }
    public void removeCustomer(Customer c) { /* ... */ }
}

public class CustomerCommunication {
    public void sendEmail(Customer c, String msg) { /* ... */ }
}

public class CustomerReporting {
    public void generateReport() { /* ... */ }
}