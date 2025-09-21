package entities;

import interfaces.Refuelable;

public class DieselEngine extends Engine implements Refuelable {

    private boolean isGlowPlugActive;

    public DieselEngine() {
        super("Diesel");
        this.isGlowPlugActive = false;
        this.isRunning = false;
    }

    @Override
    public void refuel() {
        System.out.println("Engine refueled");
    }
    
    @Override
    public void start() {
        if (isRunning) {
            System.out.println("Diesel engine is already started");
        } else {
            isRunning = true;
            System.out.println("Diesel engine started");
        }
    }

    @Override
    public void stop() {
        if (!isRunning) {
            System.out.println("Diesel engine is already stopped");
        } else {
            isRunning = false;
            System.out.println("Diesel engine stopped");
        }
    }

    public void toggleGlowPlug() {
        if (isGlowPlugActive) {
            isGlowPlugActive = !isGlowPlugActive;
            System.out.println("Glow plug deactivated");
        } else {
            isGlowPlugActive = !isGlowPlugActive;
            System.out.println("Glow plug activated");
        }
    }
}
