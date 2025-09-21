package entities;

import interfaces.Refuelable;

public class PetrolEngine extends Engine implements Refuelable {

    public PetrolEngine() {
        super("Petrol");
        this.isRunning = false;
    }

    @Override
    public void refuel() {
        System.out.println("Petrol engine refueled");
    }
    
    @Override
    public void start() {
        if (isRunning) {
            System.out.println("Petrol engine is already started");
        } else {
            isRunning = true;
            System.out.println("Petrol engine started");
        }
    }
    
    @Override
    public void stop() {
        if (!isRunning) {
            System.out.println("Petrol engine is already stopped");
        } else {
            isRunning = false;
            System.out.println("Petrol engine stopped");
        }
    }
}
