public interface Logger {
    void log(String message);
}

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        // Escreve no arquivo
    }
}

public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        // Escreve no banco de dados
    }
}

public class Application {
    private Logger logger;
    
    public Application(Logger logger) {
        this.logger = logger;
    }
    
    public void doSomething() {
        logger.log("Doing something");
    }
}