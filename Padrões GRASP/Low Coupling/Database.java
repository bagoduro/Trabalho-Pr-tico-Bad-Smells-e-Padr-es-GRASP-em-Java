// Acoplamento alto
public class OrderProcessor {
    private MySQLDatabase database;
    
    public void saveOrder(Order order) {
        database.save(order);
    }
}

// Acoplamento baixo
public class OrderProcessor {
    private Database database;
    
    public OrderProcessor(Database database) {
        this.database = database;
    }
    
    public void saveOrder(Order order) {
        database.save(order);
    }
}

public interface Database {
    void save(Order order);
}