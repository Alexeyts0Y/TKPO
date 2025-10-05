package com.example.states;

import com.example.classes.CargoLift;
import com.example.interfaces.LiftState;

public class OverloadedState implements LiftState {
    
    private final CargoLift lift;
    
    public OverloadedState(CargoLift lift) {
        this.lift = lift;
    }
    
    @Override
    public void callToFloor(int floor) {
        System.out.println("Ошибка: лифт перегружен, движение невозможно");
    }
    
    @Override
    public void load(double weight) {
        System.out.println("Ошибка: лифт уже перегружен");
    }
    
    @Override
    public void unload(double weight) {
        double newWeight = lift.getCurrentWeight() - weight;
        if (newWeight <= lift.getCapacity()) {
            lift.setCurrentWeight(newWeight);
            System.out.println("Груз разгружен. Текущий вес: " + newWeight);
            lift.setState(lift.getIdleState());
        } else {
            lift.setCurrentWeight(newWeight);
            System.out.println("Часть груза разгружена, но все еще перегруз. Вес: " + newWeight);
        }
    }
    
    @Override
    public void restorePower() {
        System.out.println("Ошибка: питание уже есть");
    }
    
    @Override
    public String getStateName() {
        return "Перегружен";
    }
}
