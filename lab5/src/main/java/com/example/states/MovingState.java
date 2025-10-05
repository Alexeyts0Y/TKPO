package com.example.states;

import com.example.classes.CargoLift;
import com.example.interfaces.LiftState;

public class MovingState implements LiftState {

    private final CargoLift lift;
    
    public MovingState(CargoLift lift) {
        this.lift = lift;
    }
    
    @Override
    public void callToFloor(int floor) {
        System.out.println("Ошибка: лифт уже движется");
    }
    
    @Override
    public void load(double weight) {
        System.out.println("Ошибка: нельзя загружать во время движения");
    }
    
    @Override
    public void unload(double weight) {
        System.out.println("Ошибка: нельзя разгружать во время движения");
    }
    
    @Override
    public void restorePower() {
        System.out.println("Ошибка: питание уже есть");
    }
    
    @Override
    public String getStateName() {
        return "Движение";
    }

}
