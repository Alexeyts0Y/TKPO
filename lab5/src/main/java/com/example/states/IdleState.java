package com.example.states;

import com.example.classes.CargoLift;
import com.example.interfaces.LiftState;

public class IdleState implements LiftState {
    
    private final CargoLift lift;
    
    public IdleState(CargoLift lift) {
        this.lift = lift;
    }
    
    @Override
    public void callToFloor(int floor) {
        System.out.println("Лифт вызван на этаж " + floor);
        lift.setCurrentFloor(floor);
        lift.setState(lift.getMovingState());
    }
    
    @Override
    public void load(double weight) {
        double newWeight = lift.getCurrentWeight() + weight;
        if (newWeight > lift.getCapacity()) {
            System.out.println("Перегруз! Текущий вес: " + newWeight);
            lift.setCurrentWeight(newWeight);
            lift.setState(lift.getOverloadedState());
        } else {
            lift.setCurrentWeight(newWeight);
            System.out.println("Груз загружен. Текущий вес: " + newWeight);
        }
    }
    
    @Override
    public void unload(double weight) {
        System.out.println("Ошибка: нет груза для разгрузки");
    }
    
    @Override
    public void restorePower() {
        System.out.println("Ошибка: питание уже есть");
    }
    
    @Override
    public String getStateName() {
        return "Покой";
    }
}
