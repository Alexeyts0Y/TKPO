package com.example;

import com.example.classes.CargoLift;

public class Main {

    public static void main(String[] args) {
        CargoLift lift = new CargoLift(1000, 0.3);
        
        lift.printStatus();
        
        lift.load(500);
        lift.callToFloor(5);
        lift.printStatus();
        
        lift.load(600);
        lift.printStatus();
        
        lift.unload(400);
        lift.printStatus();
        
        lift.callToFloor(3);
        lift.printStatus();
        
        lift.restorePower();
        lift.printStatus();
    }
}