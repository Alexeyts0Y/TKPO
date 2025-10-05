package com.example.states;

import com.example.classes.CargoLift;
import com.example.interfaces.LiftState;

public class NoPowerState implements LiftState {
    
    private final CargoLift lift;
    
    public NoPowerState(CargoLift lift) {
        this.lift = lift;
    }
    
    @Override
    public void callToFloor(int floor) {
        System.out.println("Ошибка: нет питания");
    }
    
    @Override
    public void load(double weight) {
        System.out.println("Ошибка: нет питания");
    }
    
    @Override
    public void unload(double weight) {
        System.out.println("Ошибка: нет питания");
    }
    
    @Override
    public void restorePower() {
        System.out.println("Питание восстановлено");
        lift.setState(lift.getIdleState());
    }
    
    @Override
    public String getStateName() {
        return "Нет питания";
    }
}
