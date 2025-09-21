package entities;

import interfaces.AfterburnerCapable;
import interfaces.Refuelable;

public class JetEngine extends Engine implements Refuelable, AfterburnerCapable {

    private boolean isAfterburnerActive;

    public JetEngine() {
        super("aviation kerosene");
        this.isAfterburnerActive = false;
        this.isRunning = false;
    }

    @Override
    public void toggleAfterburner() {
        if (!isAfterburnerActive) {
            isAfterburnerActive = !isAfterburnerActive;
            System.out.println("Afterburner activated");
        } else {
            isAfterburnerActive = !isAfterburnerActive;
            System.out.println("Afterburner deactivated");
        }
    }

    @Override
    public void refuel() {
        System.out.println("Jet engine refueled");
    }

    @Override
    public void start() {
        if (isRunning) {
            System.out.println("Jet engine is already started");
        } else {
            isRunning = true;
            System.out.println("Jet engine started");
        }
    }

    @Override
    public void stop() {
        if (!isRunning) {
            System.out.println("Jet engine is alredy stopped");
        } else {
            isRunning = false;
            System.out.println("Jet engine stopped");
        }
    }
}
