package com.example.classes;

import java.util.Random;

import com.example.interfaces.LiftState;
import com.example.machines.FiniteStateMachine;
import com.example.states.EmergencyState;
import com.example.states.IdleState;
import com.example.states.MovingState;
import com.example.states.NoPowerState;
import com.example.states.OverloadedState;

public class CargoLift {

    private int currentFloor;
    private double currentWeight;
    private final double capacity;
    private final double powerFailureProbability;
    private final Random random;
    
    private final FiniteStateMachine fsm;
    private final LiftState idleState;
    private final LiftState movingState;
    private final LiftState overloadedState;
    private final LiftState noPowerState;
    private final LiftState emergencyState;
    
    public CargoLift(double capacity, double powerFailureProbability) {
        this.capacity = capacity;
        this.powerFailureProbability = powerFailureProbability;
        this.currentFloor = 1;
        this.currentWeight = 0;
        this.random = new Random();
        
        this.idleState = new IdleState(this);
        this.movingState = new MovingState(this);
        this.overloadedState = new OverloadedState(this);
        this.noPowerState = new NoPowerState(this);
        this.emergencyState = new EmergencyState(this);
        
        this.fsm = new FiniteStateMachine(idleState);
    }
    
    private void checkPowerFailure() {
        if (random.nextDouble() < powerFailureProbability) {
            System.out.println(">>> Отключение электроэнергии! <<<");
            if (fsm.getState() == movingState) {
                fsm.setState(emergencyState);
            } else {
                fsm.setState(noPowerState);
            }
        }
    }
    
    public void callToFloor(int floor) {
        checkPowerFailure();
        fsm.callToFloor(floor);
    }
    
    public void load(double weight) {
        checkPowerFailure();
        fsm.load(weight);
    }
    
    public void unload(double weight) {
        checkPowerFailure();
        fsm.unload(weight);
    }
    
    public void restorePower() {
        fsm.restorePower();
    }
    
    public void setState(LiftState state) {
        fsm.setState(state);
    }
    
    public int getCurrentFloor() {
        return currentFloor;
    }
    
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    
    public double getCapacity() {
        return capacity;
    }
    
    public double getCurrentWeight() {
        return currentWeight;
    }
    
    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }
    
    public LiftState getIdleState() {
        return idleState;
    }
    
    public LiftState getMovingState() {
        return movingState;
    }
    
    public LiftState getOverloadedState() {
        return overloadedState;
    }
    
    public LiftState getNoPowerState() {
        return noPowerState;
    }
    
    public LiftState getEmergencyState() {
        return emergencyState;
    }
    
    public void printStatus() {
        System.out.println("=== Статус лифта ===");
        System.out.println("Состояние: " + fsm.getState().getStateName());
        System.out.println("Текущий этаж: " + currentFloor);
        System.out.println("Текущий вес: " + currentWeight + "/" + capacity);
        System.out.println("===================");
    }
}
