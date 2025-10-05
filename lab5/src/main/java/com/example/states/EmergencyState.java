package com.example.states;

import com.example.classes.CargoLift;
import com.example.interfaces.LiftState;

public class EmergencyState implements LiftState {

    private final CargoLift lift;
    
    public EmergencyState(CargoLift lift) {
        this.lift = lift;
    }
    
    @Override
    public void callToFloor(int floor) {
        System.out.println("Ошибка: аварийная ситуация");
    }
    
    @Override
    public void load(double weight) {
        System.out.println("Ошибка: аварийная ситуация");
    }
    
    @Override
    public void unload(double weight) {
        System.out.println("Ошибка: аварийная ситуация");
    }
    
    @Override
    public void restorePower() {
        System.out.println("Питание восстановлено после аварии");
        lift.setState(lift.getIdleState());
    }
    
    @Override
    public String getStateName() {
        return "Авария";
    }
}
