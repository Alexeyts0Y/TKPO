package entities;

import interfaces.Startable;
import interfaces.Stoppable;

abstract public class Engine implements Startable, Stoppable {

    protected boolean isRunning;
    protected String fuelType;

    public Engine(String fuelType) {
        this.isRunning = false;
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        if (isRunning) {
            System.out.println("Engine already started");
        } else {
            isRunning = true;
            System.out.println("Engine started");
        }
    }

    @Override
    public void stop() {
        if (!isRunning) {
            System.out.println("Engine already stopped");
        } else {
            isRunning = false;
            System.out.println("Engine stopped");
        }
    }
}
