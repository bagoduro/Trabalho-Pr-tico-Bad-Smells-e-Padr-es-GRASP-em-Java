public interface Honkable {
    void honk();
}

public class Vehicle implements Honkable {
    protected String brand;
    protected String model;
    
    public void startEngine() {
        System.out.println("Engine started");
    }
    
    @Override
    public void honk() {
        System.out.println("Beep beep!");
    }
}

public class Bicycle implements Honkable {
    private String brand;
    private String model;
    
    @Override
    public void honk() {
        System.out.println("Ring ring!");
    }
}