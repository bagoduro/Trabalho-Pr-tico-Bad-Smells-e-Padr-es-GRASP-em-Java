public interface DataStorage {
    void save(String key, String value);
    String load(String key);
}

public class FileSystemStorage implements DataStorage {
    @Override
    public void save(String key, String value) {
        // Salva no sistema de arquivos
    }
    
    @Override
    public String load(String key) {
        // Carrega do sistema de arquivos
        return null;
    }
}

public class DatabaseStorage implements DataStorage {
    @Override
    public void save(String key, String value) {
        // Salva no banco de dados
    }
    
    @Override
    public String load(String key) {
        // Carrega do banco de dados
        return null;
    }
}

public class Application {
    private DataStorage storage;
    
    public Application(DataStorage storage) {
        this.storage = storage;
    }
    
    public void run() {
        storage.save("config", "value");
        String value = storage.load("config");
    }
}