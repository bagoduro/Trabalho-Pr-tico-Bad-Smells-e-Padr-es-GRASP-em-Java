public class Vehicle {
    protected String brand;
    protected String model;
    protected int numberOfWheels;
    
    public void startEngine() {
        System.out.println("Engine started");
    }
    
    public void honk() {
        System.out.println("Beep beep!");
    }
}

public class Bicycle extends Vehicle {
    // Bicycle não usa startEngine() mas herda de Vehicle
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycles don't have engines!");
    }
}