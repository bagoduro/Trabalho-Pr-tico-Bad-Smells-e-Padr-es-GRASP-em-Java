public class Customer {
    private String id;
    private String name;
    // outros campos
    
    // Sem métodos de persistência
}

public class CustomerRepository {
    public void save(Customer customer) {
        // Lógica de persistência
    }
    
    public Customer findById(String id) {
        // Lógica de recuperação
        return null;
    }
}